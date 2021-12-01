package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.RoleMapper;
import com.kkb.mapper.RoleMenuMapper;
import com.kkb.mapper.UserMapper;
import com.kkb.pojo.*;
import com.kkb.vo.DoctorQueryVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.print.Doc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DoctorService implements Serializable {
    @Resource
    private DoctorMapper doctorMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;

    /**
     * 多添加分页查询
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Doctor> queryByPage(Integer pageNum, Integer pageSize, DoctorQueryVO vo){
        PageHelper.startPage(pageNum,pageSize);
        // 自定义多条件查询,结果已包括用户姓名
        List<Doctor> doctors = doctorMapper.selectDoctorList(vo);
        return new PageInfo<>(doctors);
    }

    /**
     * 根据主键查询
     * @param dId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Doctor queryById(Integer dId) throws Exception {
        Doctor doctor = doctorMapper.selectByPrimaryKey(dId);
        if(doctor.getuId() == null){
            throw new Exception("医生信息did=" + dId + " 没有uid");
        }
        User user = userMapper.selectByPrimaryKey(doctor.getuId());
        if(user == null){
            throw new Exception("医生信息did=" + dId + " 字段uid=" + doctor.getuId() + "在用户表中查询不到");
        }
        doctor.setUser(user);
        return doctor;
    }

    /**
     * 根据主键修改
     * @param dId
     * @param doctor
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int updateDoctor(Integer dId, Doctor doctor){
        doctor.setdId(dId);
        doctor.setdUpdateTime(new Date());
        return doctorMapper.updateByPrimaryKeySelective(doctor);
    }

    /**
     * 新增医生数据
     * @param doctor
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int addDoctor(Doctor doctor) throws Exception {
        // 0.查询医生角色id
        Integer doctorId = roleMapper.selectDoctorId();
        if(doctorId == null){
            throw new Exception("还未创建医生角色");
        }
        // 若之前存在用户数据,先删除
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andULoginNameEqualTo(doctor.getdPhone());
        userMapper.deleteByExample(userExample);
        // 添加user
        User user = new User();
        // 角色id:医生
        user.setrId(doctorId);
        // 用户名:默认手机号
        user.setuLoginName(doctor.getdPhone());
        // 真实姓名:doctor获取
        user.setuTrueName(doctor.getDoctorName());
        // 密码:默认手机号
        user.setuPassword(doctor.getdPhone());
        // 状态:0正常
        user.setuState(0);
        // 邮箱
        user.setuEmail(doctor.getdEmail());
        // 创建日期
        user.setuCreateTime(new Date());
        // 添加user
        userMapper.insertSelective(user);
        if(user.getuId() == null){
            throw new Exception("创建用户失败");
        }
        doctor.setuId(user.getuId());
        doctor.setdState(0);
        doctor.setdCreateTime(new Date());
        doctor.setdIntime(new Date());
        return doctorMapper.insertSelective(doctor);
    }


    /**
     * 根据id更新医生信息
     * @param dId
     * @param doctor
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int updateById(Integer dId, Doctor doctor) throws Exception {
        doctor.setdId(dId);
        doctor.setdUpdateTime(new Date());
        // 更新user信息
        User user = new User();
        user.setuId(doctor.getuId());
        user.setuUpdateTime(new Date());
        user.setuEmail(doctor.getdEmail());
        user.setuTrueName(doctor.getDoctorName());
        user.setuPassword(doctor.getdPhone());
        user.setuLoginName(doctor.getdPhone());
        int i = userMapper.updateByPrimaryKeySelective(user);
        if(i == 0){
            throw new Exception("更新医生相关user信息失败,dId=" + doctor.getuId());
        }
        // 更新doctor信息
        return doctorMapper.updateByPrimaryKeySelective(doctor);
    }

    /**
     * 医生身份证唯一性的验证
     * @param dIdCar
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int queryByIdCar(String dIdCar) throws Exception {
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria criteria = doctorExample.createCriteria();
        if (dIdCar == null && "".equals(dIdCar.trim()))
            throw new Exception("医生身份证唯一性的验证身份证idCard为空");
        criteria.andDIdCarEqualTo(dIdCar);
        // 添加未删除的条件
        criteria.andDIsDelEqualTo(0);
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        return doctors.size();
    }

    /**
     * 根据主键删除医生数据
     * @param dId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int deleteDoctor(int dId, int uId) throws Exception {
        // 1.删除医生
        Doctor doctor = new Doctor();
        doctor.setdId(dId);
        // 删除
        doctor.setdIsDel(1);
        // 离职
        doctor.setdState(1);
        // 更新doctor
        int i = doctorMapper.updateByPrimaryKeySelective(doctor);
        if(i == 0){
            throw new Exception("逻辑删除doctor失败,dId: " + dId);
        }
        // 2.禁用用户
        User user = new User();
        user.setuId(uId);
        // 禁用
        user.setuState(1);
        // 更新user
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 创建excel
     * @param dIds
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<Doctor> createExcelMsg(List<Integer> dIds) throws Exception {
        List<Doctor> doctorList = new ArrayList<>();
        for (Integer dId : dIds) {
            // 查询doctor信息
            Doctor doctor = doctorMapper.selectByPrimaryKey(dId);
            if(doctor == null)
                throw new Exception("查询不到doctor信息, dId: " + dId);
            // 转换封装性别
            doctor.setStrDSex(doctor.getdSex()==0?"男":"女");
            doctor.setDoctorIdCar(doctor.getdIdCar());
            doctor.setDoctorPhone(doctor.getdPhone());
            doctor.setDoctorTelphone(doctor.getdPhone());
            doctor.setDoctorBirthday(doctor.getdBirthday());
            doctor.setDoctorAge(doctor.getdAge());
            doctor.setDoctorEmail(doctor.getdEmail());
            doctor.setDoctorKeshi(doctor.getdKeshi());
            doctor.setDoctorXueli(doctor.getdXueli());
            doctor.setDoctorDesc(doctor.getdDesc());
            // 查询user信息
            if(doctor.getuId() == null)
                throw new Exception("通过doctor获取不到uId, dId: " + dId);
            User user = userMapper.selectByPrimaryKey(doctor.getuId());
            if(user!=null && user.getuTrueName()!=null){
                // 封装user姓名
                doctor.setDoctorName(user.getuTrueName());
            }
            doctorList.add(doctor);
        }
        return doctorList;
    }
}