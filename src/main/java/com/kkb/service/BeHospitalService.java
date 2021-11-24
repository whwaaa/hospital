package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.*;
import com.kkb.pojo.*;
import com.kkb.vo.RegisterQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * shandong-hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/11/21
 */
@Service
public class BeHospitalService {

    // 用户Mapper
    @Autowired
    private UserMapper userMapper;
    // 医生Mapper
    @Autowired
    private DoctorMapper doctorMapper;
    // 挂号表Mapper
    @Autowired
    private HosRegisterMapper hosRegisterMapper;
    // 挂号表和住院表Mapper
    @Autowired
    private HosrHospitalMiddleMapper hosrHospitalMiddleMapper;
    // 住院表Mapper
    @Autowired
    private BeHospitalMapper beHospitalMapper;

    @Autowired
    private AccessService accessService;

    /**
     * 多条件分页查
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo queryList(Integer pageNum, Integer pageSize, RegisterQueryVo vo){
        // 1. 处理医生姓名, 医生所属科室条件
        if(vo.getDoctorName()!=null && !"".equals(vo.getDoctorName().trim()) || vo.getdKeshi()!=null && !"".equals(vo.getdKeshi().trim())) {
            DoctorExample doctorExample = new DoctorExample();
            DoctorExample.Criteria criteria1 = doctorExample.createCriteria();
            if(vo.getDoctorName()!=null && !"".equals(vo.getDoctorName().trim())){
                // 查询名字相似的所有用户id, 设置条件让分页查到0条
                UserExample userExample = new UserExample();
                UserExample.Criteria criteria = userExample.createCriteria();
                criteria.andUTrueNameLike("%" + vo.getDoctorName() + "%");
                List<Integer> userIds = userMapper.selectUserIdByExample(userExample);
                if(userIds == null || userIds.size()==0){
                    // 模糊查询没有该姓名的用户
                    vo.setHosrId("-1");
                }else{
                    // 查询包含userIds和所属科室模糊查得到的医生id集合
                    criteria1.andUIdIn(userIds);
                }
            }
            if(vo.getdKeshi()!=null && !"".equals(vo.getdKeshi().trim())){
                criteria1.andDKeshiLike("%" + vo.getdKeshi() + "%");
            }
            List<Integer> doctorIds = doctorMapper.selectDoctorIdList(doctorExample);
            if(doctorIds==null || doctorIds.size()==0){
                // 模糊查询没有符合的医生id, 设置条件让分页查到0条
                vo.setHosrId("-1");
            }else{
                // 以上代码最终目的为获取模糊查询到的医生Id集合
                vo.setDoctorId(doctorIds);
            }

        }
        // 2. 处理单项模糊时间查和多项时间区间查条件
        if(vo.getCreateTimeStartBlur()!=null && !"".equals(vo.getCreateTimeStartBlur().trim()) &&
                vo.getCreateTimeEndBlur()!=null && !"".equals(vo.getCreateTimeEndBlur().trim())){
            // 开始时间和结束时间都不为空
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date createTimeStart = format.parse(vo.getCreateTimeStartBlur());
                Date createTimeEnd = format.parse(vo.getCreateTimeEndBlur());
                vo.setCreateTimeStart(createTimeStart);
                vo.setCreateTimeEnd(createTimeEnd);
                // 去除模糊查询时间的条件, 使用日期范围查询
                vo.setCreateTimeStartBlur(null);
                vo.setCreateTimeEndBlur(null);
            } catch (ParseException e) {
                // TODO : 格式化时间异常
                return null;
            }
        }else if(vo.getCreateTimeStartBlur()!=null && !"".equals(vo.getCreateTimeStartBlur().trim())){
            // 仅开始时间不为空
            vo.setCreateTimeEnd(null);
        }else if(vo.getCreateTimeEndBlur()!=null && !"".equals(vo.getCreateTimeEndBlur().trim())){
            // 仅结束时间不为空
        }
        // 3. 处理挂号单模糊差条件
        if(vo.getHosrId()!=null && "".equals(vo.getHosrId())){
            // 如果是空串则赋null, 去除模糊查条件
            vo.setHosrId(null);
        }
        // 4.首查所有满足条件的挂号表id集合
        List<Integer> hosrIds = hosRegisterMapper.selectHosIdsByRedefineCondition(vo);
        // 5.将以上挂号表id集合作为条件,查询住院表和挂号表的中间表,筛选关联住院的挂号表id
        HosrHospitalMiddleExample hosrHospitalMiddleExample = new HosrHospitalMiddleExample();
        HosrHospitalMiddleExample.Criteria criteria = hosrHospitalMiddleExample.createCriteria();
        criteria.andHosrIdIn(hosrIds);
        vo.setHosrIdList(hosrHospitalMiddleMapper.selectHosrIdsByExample(hosrHospitalMiddleExample));
        vo.setHosrId(null);

        // 6.所有条件筛选处理完毕,多条件分页查
        PageHelper.startPage(pageNum, pageSize);
        List<HosRegister> hosRegisters = hosRegisterMapper.selectByRedefineCondition(vo);
        // 7.对查询结果做最后处理
        hosRegisters.forEach( register -> {
            // 关联中间表查询病人id
            HosrHospitalMiddleExample hosrHospitalMiddleExample2 = new HosrHospitalMiddleExample();
            HosrHospitalMiddleExample.Criteria criteria2 = hosrHospitalMiddleExample2.createCriteria();
            criteria2.andHosrIdEqualTo(register.getHosrId());
            List<HosrHospitalMiddle> hosrHospitalMiddles = hosrHospitalMiddleMapper.selectByExample(hosrHospitalMiddleExample2);
            if (hosrHospitalMiddles.get(0).getBehId()==null){
                // TODO : 病人挂号中间表和病人表之间数据不匹配,中间表id:hosrHospitalMiddles.get(0).getHosrHospitalId()
            }
            // 通过病人id查询获取病人表信息
            BeHospital beHospital = beHospitalMapper.selectByPrimaryKey(hosrHospitalMiddles.get(0).getBehId());
            register.setBeHospital(beHospital);
            // 处理创建时间
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String createTime = format.format(register.getHosrCreateTime());
            register.setHosrCreateTimeStr(createTime);
            // 遍历查询医生信息, 获取医生姓名
            Doctor doctor = doctorMapper.selectByPrimaryKey(register.getdId());
            User user = userMapper.selectByPrimaryKey(doctor.getuId());
            register.setDoctorName(user.getuTrueName());
            // 获取医生所属科室
            register.setKeshi(doctor.getdKeshi());
        });
        return new PageInfo(hosRegisters);
    }


    /**
     * 添加住院信息
     * @param request
     * @param hosrId : 挂号病历号id
     * @param beHospital : 住院信息
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer add(HttpServletRequest request, Integer hosrId, BeHospital beHospital){
        HosRegister hosRegister1 = new HosRegister();
        hosRegister1.setHosrId(hosrId);
        hosRegister1.setHosrState(1);
        // 更新挂号表信息
        hosRegisterMapper.updateByPrimaryKeySelective(hosRegister1);
        // 获取挂号单信息
        HosRegister hosRegister = hosRegisterMapper.selectByPrimaryKey(hosrId);
        // 同步住院人姓名
        beHospital.setBehName(hosRegister.getHosrName());
        // 添加住院日期
        beHospital.setBehCreateTime(new Date());
        // 添加
        int add = beHospitalMapper.insertSelective(beHospital);
        if(add == 0){
            // TODO : 住院信息添加失败异常
        }
        // 添加挂号住院中间表信息
        HosrHospitalMiddle hosrHospitalMiddle = new HosrHospitalMiddle();
        hosrHospitalMiddle.setHosrId(hosrId);
        hosrHospitalMiddle.setBehId(beHospital.getBehId());
        return hosrHospitalMiddleMapper.insertSelective(hosrHospitalMiddle);
    }


    /**
     * 根据主键更新
     * @param behId
     * @param beHospital
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer updateById(Integer behId, BeHospital beHospital){
        beHospital.setBehUpdateTime(new Date());
        beHospital.setBehId(behId);
        return beHospitalMapper.updateByPrimaryKeySelective(beHospital);
    }


    /**
     * 添加金额
     * @param behId
     * @param beHospital
     * @return : 返回更新后的结果
     * @throws Exception : 查询数据异常
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer addAmount(Integer behId, BeHospital beHospital) throws Exception {
        // 查询原来信息
        BeHospital beHospital1 = beHospitalMapper.selectByPrimaryKey(behId);
        if(beHospital1==null && beHospital1.getBehAntecedent()==null){
            throw new Exception("查询不到住院信息或住院信息金额不对,behId:" + behId);
        }
        // 相加金额
        BigDecimal behAntecedent = beHospital.getBehAntecedent();
        behAntecedent = behAntecedent.add(beHospital1.getBehAntecedent());
        // 封装信息
        beHospital.setBehAntecedent(behAntecedent);
        beHospital.setBehUpdateTime(new Date());
        beHospital.setBehId(behId);
        // 更新住院信息
        return beHospitalMapper.updateByPrimaryKeySelective(beHospital);
    }


    /**
     * 根据主键查询
     * @param hosrId
     * @return
     * @throws Exception
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Map<String, Object> queryById(Integer hosrId) throws Exception {
        HosRegister hosRegister = null;
        // 通过hosrId查询挂号信息
        hosRegister = hosRegisterMapper.selectByPrimaryKey(hosrId);
        if(hosRegister == null){
            throw new Exception("根据主键查询挂号信息id: "+ hosrId +" 不存在");
        }
        Doctor doctor = doctorMapper.selectByPrimaryKey(hosRegister.getdId());
        if(doctor == null){
            throw new Exception("挂号表里的医生id:"+ hosRegister.getdId() +"不存在,请检查数据库");
        }
        // 封装医生所属科室
        hosRegister.setKeshi(doctor.getdKeshi());
        User user = userMapper.selectByPrimaryKey(doctor.getuId());
        if(user == null){
            throw new Exception("医生表里的用户id:"+ doctor.getuId() +"不存在,请检查数据库");
        }
        // 封装挂号费
        hosRegister.setHosrRegPriceStr(hosRegister.getHosrRegPrice().toString() + "元");
        // 封装医生姓名
        hosRegister.setDoctorName(user.getuTrueName());

        // 通过中间表查询住院信息behId
        HosrHospitalMiddleExample hosrHospitalMiddleExample = new HosrHospitalMiddleExample();
        HosrHospitalMiddleExample.Criteria criteria = hosrHospitalMiddleExample.createCriteria();
        criteria.andHosrIdEqualTo(hosrId);
        List<HosrHospitalMiddle> hosrHospitalMiddles = hosrHospitalMiddleMapper.selectByExample(hosrHospitalMiddleExample);
        if(hosrHospitalMiddles==null || hosrHospitalMiddles.size()==0){
            throw new Exception("中间表没有与hosrId为: "+hosrId+" 的挂号表关联");
        }
        // 查询住院信息
        BeHospital beHospital = beHospitalMapper.selectByPrimaryKey(hosrHospitalMiddles.get(0).getBehId());
        if(beHospitalMapper == null){
            throw new Exception("查询不到behId为: " + hosrHospitalMiddles.get(0).getBehId() + " 的住院信息");
        }
        Map<String, Object> map = new HashMap<>();
        map.put("beHospital", beHospital);
        map.put("hosRegister", hosRegister);
        return map;
    }


    /**
     * 查询缴费信息
     * @param hosrId
     * @param behId
     * @return : 挂号信息与住院信息的集合
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Map<String, Object> queryByIds(Integer hosrId, Integer behId){
        HosRegister hosRegister = hosRegisterMapper.selectByPrimaryKey(hosrId);
        BeHospital beHospital = beHospitalMapper.selectByPrimaryKey(behId);
        Map<String, Object> map = new HashMap<>();
        map.put("hosRegister", hosRegister);
        map.put("beHospital", beHospital);
        return map;
    }


    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Map<String, Object> query(Integer hosrId) throws Exception {
        HosRegister hosRegister = null;
        // 通过hosrId查询挂号信息
        hosRegister = hosRegisterMapper.selectByPrimaryKey(hosrId);
        if(hosRegister == null){
            throw new Exception("根据主键查询挂号信息id: "+ hosrId +" 不存在");
        }
        Doctor doctor = doctorMapper.selectByPrimaryKey(hosRegister.getdId());
        if(doctor == null){
            throw new Exception("挂号表里的医生id:"+ hosRegister.getdId() +"不存在,请检查数据库");
        }
        // 封装医生所属科室
        hosRegister.setKeshi(doctor.getdKeshi());
        User user = userMapper.selectByPrimaryKey(doctor.getuId());
        if(user == null){
            throw new Exception("医生表里的用户id:"+ doctor.getuId() +"不存在,请检查数据库");
        }
        // 封装挂号费
        hosRegister.setHosrRegPriceStr(hosRegister.getHosrRegPrice().toString() + "元");
        // 封装医生姓名
        hosRegister.setDoctorName(user.getuTrueName());

        // 通过中间表查询住院信息behId
        HosrHospitalMiddleExample hosrHospitalMiddleExample = new HosrHospitalMiddleExample();
        HosrHospitalMiddleExample.Criteria criteria = hosrHospitalMiddleExample.createCriteria();
        criteria.andHosrIdEqualTo(hosrId);
        List<HosrHospitalMiddle> hosrHospitalMiddles = hosrHospitalMiddleMapper.selectByExample(hosrHospitalMiddleExample);
        if(hosrHospitalMiddles==null || hosrHospitalMiddles.size()==0){
            throw new Exception("中间表没有与hosrId为: "+hosrId+" 的挂号表关联");
        }
        // 查询住院信息
        BeHospital beHospital = beHospitalMapper.selectByPrimaryKey(hosrHospitalMiddles.get(0).getBehId());
        if(beHospitalMapper == null){
            throw new Exception("查询不到behId为: " + hosrHospitalMiddles.get(0).getBehId() + " 的住院信息");
        }
        Map<String, Object> map = new HashMap<>();
        map.put("beHospital", beHospital);
        map.put("hosRegister", hosRegister);
        return map;
    }

}






































