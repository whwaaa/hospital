package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.ChargeprojectMapper;
import com.kkb.pojo.Chargeproject;
import com.kkb.pojo.ChargeprojectExample;
import com.kkb.vo.ChargeQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/10/28/17:48
 */
@Service
public class ChargeService {
    @Autowired
    private ChargeprojectMapper chargeprojectMapper;
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Chargeproject> queryByPage(Integer pageNum, Integer pageSize, ChargeQueryVo vo){
        ChargeprojectExample example = new ChargeprojectExample();
        //创建查询条件容器
        ChargeprojectExample.Criteria criteria = example.createCriteria();
        if(vo != null){
            if(vo.getChaP_name()!=null && "".equals(vo.getChaP_name().trim())){
                criteria.andChaP_nameLike("%"+vo.getChaP_name()+"%");
            }

        }
        PageHelper.startPage(pageNum,pageSize);
        List<Chargeproject> list = chargeprojectMapper.selectByExample(example);
        return new PageInfo<Chargeproject>(list);



    }
}
