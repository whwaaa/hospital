package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.BeHospitalMapper;
import com.kkb.pojo.BeHospital;
import com.kkb.pojo.BeHospitalExample;
import com.kkb.pojo.ChargeProject;
import com.kkb.vo.CkChargeQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/11/02/20:22
 */
@Service
public class CkChargeService {
    @Autowired
    private BeHospitalMapper beHospitalMapper;
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<ChargeProject> queryByPage(Integer pageNum, Integer pageSize, CkChargeQueryVo vo){
        BeHospitalExample beHospitalExample = new BeHospitalExample();
        //创建查询条件容器
        BeHospitalExample.Criteria criteria = beHospitalExample.createCriteria();
        if(vo != null){
            if(vo.getBehId()!=null){
                criteria.andBehIdEqualTo(vo.getBehId());
            }
            if(vo.getBehName()!=null && !"".equals(vo.getBehName().trim())){
                criteria.andBehNameLike("%"+vo.getBehName()+"%");
            }

        }
        PageHelper.startPage(pageNum,pageSize);
        List<BeHospital> list = beHospitalMapper.selectByExample(beHospitalExample);

        return new PageInfo(list);
//
    }
    //根据主键查询
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public BeHospital queryById(Integer behId){
        return  beHospitalMapper.selectByPrimaryKey(behId);
    }
}
