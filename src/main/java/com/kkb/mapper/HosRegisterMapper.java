package com.kkb.mapper;

import com.kkb.pojo.HosRegister;
import com.kkb.pojo.HosRegisterExample;
import java.util.List;

import com.kkb.vo.RegisterQueryVo;
import org.apache.ibatis.annotations.Param;

public interface HosRegisterMapper {
    long countByExample(HosRegisterExample example);

    int deleteByExample(HosRegisterExample example);

    int deleteByPrimaryKey(Integer hosrId);

    int insert(HosRegister record);

    int insertSelective(HosRegister record);

    List<HosRegister> selectByExample(HosRegisterExample example);

    HosRegister selectByPrimaryKey(Integer hosrId);

    int updateByExampleSelective(@Param("record") HosRegister record, @Param("example") HosRegisterExample example);

    int updateByExample(@Param("record") HosRegister record, @Param("example") HosRegisterExample example);

    int updateByPrimaryKeySelective(HosRegister record);

    int updateByPrimaryKey(HosRegister record);

    // 自定义条件查询
    List<HosRegister> selectByRedefineCondition(RegisterQueryVo vo);
}