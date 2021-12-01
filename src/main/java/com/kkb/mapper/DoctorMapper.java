package com.kkb.mapper;

import com.kkb.pojo.Doctor;
import com.kkb.pojo.DoctorExample;
import java.util.List;
import java.util.Map;

import com.kkb.vo.DoctorQueryVO;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    long countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    // 多条件查询Id集合
    List<Integer> selectDoctorIdList(DoctorExample example);

    // 多条件查询doctor集合
    List<Doctor> selectDoctorList(DoctorQueryVO vo);
}