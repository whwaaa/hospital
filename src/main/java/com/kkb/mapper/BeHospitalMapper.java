package com.kkb.mapper;

import com.kkb.pojo.BeHospital;
import com.kkb.pojo.BeHospitalExample;
import java.util.List;

import com.kkb.vo.CkChargeQueryVo;
import org.apache.ibatis.annotations.Param;

public interface BeHospitalMapper {
    long countByExample(BeHospitalExample example);

    int deleteByExample(BeHospitalExample example);

    int deleteByPrimaryKey(Integer behId);

    int insert(BeHospital record);

    int insertSelective(BeHospital record);

    List<BeHospital> selectByExample(BeHospitalExample example);

    BeHospital selectByPrimaryKey(Integer behId);

    int updateByExampleSelective(@Param("record") BeHospital record, @Param("example") BeHospitalExample example);

    int updateByExample(@Param("record") BeHospital record, @Param("example") BeHospitalExample example);

    int updateByPrimaryKeySelective(BeHospital record);

    int updateByPrimaryKey(BeHospital record);

    // 自定义病历号,姓名模糊查询
    List<BeHospital> selectByBehIdAndBehName(CkChargeQueryVo vo);
}