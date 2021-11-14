package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.HosRegisterMapper;
import com.kkb.mapper.UserMapper;
import com.kkb.pojo.*;
import com.kkb.vo.RegisterQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindException;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * 挂号表
 * @author wuhanwei
 * @version 1.0
 * @date 2021/11/12
 */
@Service
public class RegisterService {

    @Autowired
    private HosRegisterMapper hosRegisterMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DoctorMapper doctorMapper;

    @Autowired
    private AccessService accessService;

    /**
     * 多条件分页查
     * @param pageNum
     * @param pageSize
     * @param vo : 查询成功有数据返回数据, 否则返回null
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo queryList(Integer pageNum, Integer pageSize, RegisterQueryVo vo) throws BindException {;
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
        // 4. 多条件分页查
        PageHelper.startPage(pageNum, pageSize);
        List<HosRegister> hosRegisters = hosRegisterMapper.selectByRedefineCondition(vo);
        hosRegisters.forEach( register -> {
            // 处理创建时间
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String createTime = format.format(register.getHosrCreateTime());
            register.setHosrCreateTimeStr(createTime);
            // 遍历查询医生信息
            Doctor doctor = doctorMapper.selectByPrimaryKey(register.getdId());
            User user = userMapper.selectByPrimaryKey(doctor.getuId());
            // 获取医生姓名
            register.setDoctorName(user.getuTrueName());
            // 获取医生所属科室
            register.setKeshi(doctor.getdKeshi());
        });
        return new PageInfo(hosRegisters);
    }


    /**
     * 添加一条挂号数据
     * @param request
     * @param hosRegister
     * @return : 添加成功返回1, 失败返回0
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Integer addRegister(HttpServletRequest request, HosRegister hosRegister){
        // 获取当前用户信息
        User user = accessService.paseUserMessage(request);
        hosRegister.setuId(user.getuId());
        hosRegister.setHosrCreateTime(new Date());
        return hosRegisterMapper.insertSelective(hosRegister);
    }


    /**
     * 根据主键更新
     * @param request
     * @param hosRegister
     * @return : 修改成功返回1, 失败返回0
     */
    @Transactional(propagation =  Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Integer updateByHosRegId(HttpServletRequest request, HosRegister hosRegister){
        // 获取当前用户信息
        User user = accessService.paseUserMessage(request);
        hosRegister.setuId(user.getuId());
        hosRegister.setHosrUpdateTime(new Date());
        return hosRegisterMapper.updateByPrimaryKeySelective(hosRegister);
    }

    /**
     * 根据主键逻辑删除
     * @param request
     * @param hosRegister
     * @return : 删除成功返回1, 失败返回0
     */
    @Transactional(propagation =  Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Integer deleteByHosRegId(HttpServletRequest request, HosRegister hosRegister){
        // 获取当前用户信息
        User user = accessService.paseUserMessage(request);
        hosRegister.setuId(user.getuId());
        hosRegister.setHosrUpdateTime(new Date());
        // 逻辑删除
        hosRegister.setHosrIsDel(1);
        return hosRegisterMapper.updateByPrimaryKeySelective(hosRegister);
    }

    /**
     * 添加一条挂号信息
     * @param request
     * @param hosRegister
     * @return
     */
    @Transactional(propagation =  Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Integer add(HttpServletRequest request, HosRegister hosRegister){
        // 获取当前用户id
        User user = accessService.paseUserMessage(request);
        hosRegister.setuId(user.getuId());
        // 添加创建时间
        hosRegister.setHosrCreateTime(new Date());
        return hosRegisterMapper.insertSelective(hosRegister);
    }


    /**
     * 查询所有科室及医生信息
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Map<String, List<Doctor>> queryAllDotorMsg() throws Exception {
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria criteria = doctorExample.createCriteria();
        // 非删除条件
        criteria.andDIsDelEqualTo(0);
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        Map<String, List<Doctor>> keshiMap = new HashMap<>();
        for (Doctor doctor : doctors) {
            // 查询医生姓名
            User user = userMapper.selectByPrimaryKey(doctor.getuId());
            if(user == null){
                throw new Exception("数据库医生表和用户表uId不匹配");
            }
            doctor.setDoctorName(user.getuTrueName());
            // 封装到map集合
            List<Doctor> doctorList = keshiMap.get(doctor.getdKeshi());
            if(doctorList != null){
                doctorList.add(doctor);
            }else{
                doctorList = new ArrayList<>();
                doctorList.add(doctor);
                keshiMap.put(doctor.getdKeshi(), doctorList);
            }
        }
        return keshiMap;
    }

    /**
     * 更新挂号信息
     * @param request
     * @param hosRegister
     * @param hosrId
     * @return
     */
    @Transactional(propagation =  Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Integer updateById(HttpServletRequest request, HosRegister hosRegister, Integer hosrId){
        // 更新的主键
        hosRegister.setHosrId(hosrId);
        // 获取当前用户id
        User user = accessService.paseUserMessage(request);
        hosRegister.setuId(user.getuId());
        // 添加修改时间
        hosRegister.setHosrUpdateTime(new Date());
        return hosRegisterMapper.updateByPrimaryKeySelective(hosRegister);
    }

    /**
     * 根据主键查询挂号信息
     * @param hosrId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public HosRegister queryById(Integer hosrId) throws Exception {
        if(hosrId != null){
            HosRegister hosRegister = hosRegisterMapper.selectByPrimaryKey(hosrId);
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
            return hosRegister;
        }
        return null;
    }

}
