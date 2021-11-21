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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
}























