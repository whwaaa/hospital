package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.UserMapper;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.DoctorExample;
import com.kkb.pojo.User;
import com.kkb.vo.DoctorQueryVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class DoctorService {
    @Resource
    private DoctorMapper doctorMapper;

    @Resource
    private UserMapper userMapper;

    /**
     * 多添加分页查询
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Doctor> queryByPage(Integer pageNum, Integer pageSize, DoctorQueryVO vo){
        /*多添加查询*/
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria criteria = doctorExample.createCriteria();
        if (vo != null){
            /*医生编号*/
            if (vo.getdId()!=null){
                criteria.andDIdEqualTo(vo.getdId());
            }
            /*医生姓名模糊查询*/

            /*医生科室模糊查询*/
            if (vo.getdKeshi()!=null && "".equals(vo.getdKeshi().trim())){
                criteria.andDKeshiLike("%"+vo.getdKeshi().trim()+"%");
            }
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        for (Doctor doctor: doctors) {
            if (doctor.getuId() != null){
                User user = userMapper.selectByPrimaryKey(doctor.getuId());
                doctor.setUser(user);
            }
        }
        return new PageInfo<>(doctors);
    }

    /**
     * 根据主键查询
     * @param dId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Doctor queryById(Integer dId){
        return doctorMapper.selectByPrimaryKey(dId);
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
    public int addDoctor(Doctor doctor){
        doctor.setdCreateTime(new Date());
        return doctorMapper.insertSelective(doctor);
    }

    /**
     * 医生身份证唯一性的验证
     * @param dIdCar
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int queryByIdCar(String dIdCar){
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria criteria = doctorExample.createCriteria();
        if (dIdCar != null && !"".equals(dIdCar.trim())){
            criteria.andDIdCarEqualTo(dIdCar);
        }
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        return doctors.size();
    }

    /**
     * 根据主键删除医生数据
     * @param dId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int deleteDoctor(int dId){
        return doctorMapper.deleteByPrimaryKey(dId);
    }
}