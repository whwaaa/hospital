package com.kkb.mapper;

import com.kkb.pojo.Drugpeople;
import com.kkb.pojo.DrugpeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugpeopleMapper {
    long countByExample(DrugpeopleExample example);

    int deleteByExample(DrugpeopleExample example);

    int deleteByPrimaryKey(Integer dr_p_id);

    int insert(Drugpeople record);

    int insertSelective(Drugpeople record);

    List<Drugpeople> selectByExample(DrugpeopleExample example);

    Drugpeople selectByPrimaryKey(Integer dr_p_id);

    int updateByExampleSelective(@Param("record") Drugpeople record, @Param("example") DrugpeopleExample example);

    int updateByExample(@Param("record") Drugpeople record, @Param("example") DrugpeopleExample example);

    int updateByPrimaryKeySelective(Drugpeople record);

    int updateByPrimaryKey(Drugpeople record);
}