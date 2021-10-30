package com.kkb.mapper;

import com.kkb.pojo.PricePeople;
import com.kkb.pojo.PricePeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PricePeopleMapper {
    long countByExample(PricePeopleExample example);

    int deleteByExample(PricePeopleExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(PricePeople record);

    int insertSelective(PricePeople record);

    List<PricePeople> selectByExample(PricePeopleExample example);

    PricePeople selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") PricePeople record, @Param("example") PricePeopleExample example);

    int updateByExample(@Param("record") PricePeople record, @Param("example") PricePeopleExample example);

    int updateByPrimaryKeySelective(PricePeople record);

    int updateByPrimaryKey(PricePeople record);
}