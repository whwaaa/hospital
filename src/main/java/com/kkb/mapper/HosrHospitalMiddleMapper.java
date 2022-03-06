package com.kkb.mapper;

import com.kkb.pojo.HosrHospitalMiddle;
import com.kkb.pojo.HosrHospitalMiddleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HosrHospitalMiddleMapper {
    long countByExample(HosrHospitalMiddleExample example);

    int deleteByExample(HosrHospitalMiddleExample example);

    int deleteByPrimaryKey(Integer hosrHospitalId);

    int insert(HosrHospitalMiddle record);

    int insertSelective(HosrHospitalMiddle record);

    List<HosrHospitalMiddle> selectByExample(HosrHospitalMiddleExample example);

    HosrHospitalMiddle selectByPrimaryKey(Integer hosrHospitalId);

    int updateByExampleSelective(@Param("record") HosrHospitalMiddle record, @Param("example") HosrHospitalMiddleExample example);

    int updateByExample(@Param("record") HosrHospitalMiddle record, @Param("example") HosrHospitalMiddleExample example);

    int updateByPrimaryKeySelective(HosrHospitalMiddle record);

    int updateByPrimaryKey(HosrHospitalMiddle record);

    // 查询挂号表id集合
    List<Integer> selectHosrIdsByExample(HosrHospitalMiddleExample example);
}