package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.BeHospitalMapper;
import com.kkb.mapper.ChargeProjectMapper;
import com.kkb.mapper.PricePeopleMapper;
import com.kkb.pojo.*;
import com.kkb.vo.CkChargeQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.net.URLEncoder;
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

    // 收费项和病人之间的中间表
    @Autowired
    private PricePeopleMapper pricePeopleMapper;
    // 收费项目表
    @Autowired
    private ChargeProjectMapper chargeProjectMapper;


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
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor ={Exception.class})
    public Integer pay(Integer behId){
        BeHospital beHospital = new BeHospital();
        beHospital.setBehId(behId);
        beHospital.setBehClosePrice(1);     // 是否结算 0未结算 1已结算
       beHospital.setBehUpdateTime(new Date());
        return beHospitalMapper.updateByPrimaryKeySelective(beHospital);
    }

    //导出Excel
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<ChargeProject> createExcelMsg(List<Integer> behIds) throws Exception {
        List<ChargeProject> chargeProjectList = new ArrayList<>();
        for (Integer behId : behIds) {
            // 查询住院表
            BeHospital beHospital = beHospitalMapper.selectByPrimaryKey(behId);
            if(beHospital==null || beHospital.getBehName()==null){
                String msg = "住院表查询不到病人信息, behId:" + behId;
                String encode = URLEncoder.encode(msg, "UTF-8");
                throw new Exception(encode);
            }
            // 通过收费项和病人中间表获取chapId
            PricePeopleExample pricePeopleExample = new PricePeopleExample();
            PricePeopleExample.Criteria criteria = pricePeopleExample.createCriteria();
            criteria.andBehIdEqualTo(behId);
            List<PricePeople> pricePeople = pricePeopleMapper.selectByExample(pricePeopleExample);
            if(pricePeople.size()!=1 || pricePeople.get(0).getChapId()==null){
                String msg = "无法通过收费项和病人中间表获取chapId, behId:" + behId;
                String encode = URLEncoder.encode(msg, "UTF-8");
                throw new Exception(encode);
            }
            // 查询收费项目
            ChargeProject chargeProject = chargeProjectMapper.selectByPrimaryKey(pricePeople.get(0).getChapId());
            if(chargeProject == null){
                String msg = " 查询收费项目为空, chapId:" + pricePeople.get(0).getChapId();
                String encode = URLEncoder.encode(msg, "UTF-8");
                throw new Exception(encode);
            }
            // 封装检查日期
            chargeProject.setBeChargeTime(pricePeople.get(0).getCreateTime());
            // 封装病人姓名
            chargeProject.setBehName(beHospital.getBehName());
            chargeProjectList.add(chargeProject);
        }
        return chargeProjectList;
    }
}
