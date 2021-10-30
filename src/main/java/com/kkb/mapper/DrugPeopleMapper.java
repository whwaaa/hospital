package com.kkb.mapper;

import com.kkb.pojo.DrugPeople;
import com.kkb.pojo.DrugPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugPeopleMapper {
    long countByExample(DrugPeopleExample example);

    int deleteByExample(DrugPeopleExample example);

    int deleteByPrimaryKey(Integer drbehId);

    int insert(DrugPeople record);

    int insertSelective(DrugPeople record);

    List<DrugPeople> selectByExample(DrugPeopleExample example);

    DrugPeople selectByPrimaryKey(Integer drbehId);

    int updateByExampleSelective(@Param("record") DrugPeople record, @Param("example") DrugPeopleExample example);

    int updateByExample(@Param("record") DrugPeople record, @Param("example") DrugPeopleExample example);

    int updateByPrimaryKeySelective(DrugPeople record);

    int updateByPrimaryKey(DrugPeople record);
}