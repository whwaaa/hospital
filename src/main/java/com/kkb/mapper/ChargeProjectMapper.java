package com.kkb.mapper;

import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.ChargeProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeProjectMapper {
    long countByExample(ChargeProjectExample example);

    int deleteByExample(ChargeProjectExample example);

    int deleteByPrimaryKey(Integer chapId);

    int insert(ChargeProject record);

    int insertSelective(ChargeProject record);

    List<ChargeProject> selectByExample(ChargeProjectExample example);

    ChargeProject selectByPrimaryKey(Integer chapId);

    int updateByExampleSelective(@Param("record") ChargeProject record, @Param("example") ChargeProjectExample example);

    int updateByExample(@Param("record") ChargeProject record, @Param("example") ChargeProjectExample example);

    int updateByPrimaryKeySelective(ChargeProject record);

    int updateByPrimaryKey(ChargeProject record);
}