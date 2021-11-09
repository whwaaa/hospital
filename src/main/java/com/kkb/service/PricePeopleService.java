package com.kkb.service;

import com.kkb.mapper.PricePeopleMapper;
import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.PricePeople;
import com.kkb.pojo.PricePeopleExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/11/03/21:21
 */
@Service
public class PricePeopleService {
    @Resource
    private PricePeopleMapper pricePeopleMapper;
    public List<PricePeople>  queryByBehId(Integer behId){
        PricePeopleExample pricePeopleExample =new PricePeopleExample();
        //构建查询容器
        PricePeopleExample.Criteria criteria = pricePeopleExample.createCriteria();
        if (behId !=null){
            criteria.andBehIdEqualTo(behId);
        }
        List<PricePeople> list = pricePeopleMapper.selectByExample(pricePeopleExample);

        return list;
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer addPricePeople(PricePeople pricePeople){
        pricePeople.setCreateTime(new Date());
        return pricePeopleMapper.insertSelective(pricePeople);
    }
}
