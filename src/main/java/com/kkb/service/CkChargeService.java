package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.BeHospitalMapper;
import com.kkb.pojo.BeHospital;
import com.kkb.pojo.BeHospitalExample;
import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.PricePeople;
import com.kkb.vo.CkChargeQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
    @Autowired
    private PricePeopleService pricePeopleService;
    @Autowired ChargeService chargeService;
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
//        PageInfo pageInfo = new PageInfo(list);
//        for (BeHospital o : (BeHospital)pageInfo.getList()) {
//
//        }
        for (BeHospital beHospital : list) {
            BigDecimal allCast = queryBlank(beHospital.getBehId());
            beHospital.setAllCast(allCast);
        }
        return new PageInfo(list);

    }
    //根据主键查询
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public BeHospital queryById(Integer behId){
        return  beHospitalMapper.selectByPrimaryKey(behId);
    }
    //查询病人余额
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public BigDecimal queryBlank(Integer behId){
        //查询中间表,获取收费项chapId
        List<PricePeople> pricePeoples = pricePeopleService.queryByBehId(behId);
        //获取病人信息
        BigDecimal allCast = new BigDecimal(0);
        for (PricePeople pricePeople : pricePeoples) {
            Integer chapId = pricePeople.getChapId();
            //获取收费项目信息
            ChargeProject chargeProject = chargeService.queryById(chapId);
            BigDecimal chapMoney = chargeProject.getChapMoney();
            allCast=allCast.add(chapMoney);
        }
        return allCast;
    }
    //结算
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor ={Exception.class})
    public Integer pay(Integer behId){
        BeHospital beHospital = new BeHospital();
        beHospital.setBehId(behId);
        beHospital.setBehClosePrice(1);     // 是否结算 0未结算 1已结算
       beHospital.setBehUpdateTime(new Date());
        return beHospitalMapper.updateByPrimaryKeySelective(beHospital);
    }
}
