package com.kkb.mapper;

import com.kkb.pojo.HospitalRegister;
import com.kkb.pojo.HospitalRegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalRegisterMapper {
    long countByExample(HospitalRegisterExample example);

    int deleteByExample(HospitalRegisterExample example);

    int deleteByPrimaryKey(Integer hospitalRegisterId);

    int insert(HospitalRegister record);

    int insertSelective(HospitalRegister record);

    List<HospitalRegister> selectByExample(HospitalRegisterExample example);

    HospitalRegister selectByPrimaryKey(Integer hospitalRegisterId);

    int updateByExampleSelective(@Param("record") HospitalRegister record, @Param("example") HospitalRegisterExample example);

    int updateByExample(@Param("record") HospitalRegister record, @Param("example") HospitalRegisterExample example);

    int updateByPrimaryKeySelective(HospitalRegister record);

    int updateByPrimaryKey(HospitalRegister record);
}