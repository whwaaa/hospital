package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.ChargeProjectMapper;
import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.ChargeProjectExample;
import com.kkb.pojo.User;
import com.kkb.vo.ChargeQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/10/28/17:48
 */
@Service
public class ChargeService {
    @Autowired
    private ChargeProjectMapper chargeProjectMapper;
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<ChargeProject> queryByPage(Integer pageNum, Integer pageSize, ChargeQueryVo vo){
        ChargeProjectExample chargeProjectExample = new ChargeProjectExample();
        //创建查询条件容器
        ChargeProjectExample.Criteria criteria = chargeProjectExample.createCriteria();
        if(vo != null){
            if(vo.getChapName()!=null && !"".equals(vo.getChapName().trim())){
                criteria.andChapNameLike("%"+vo.getChapName()+"%");
            }

        }
        criteria.andChapIsDelEqualTo(0);
        PageHelper.startPage(pageNum,pageSize);
        List<ChargeProject> list = chargeProjectMapper.selectByExample(chargeProjectExample);
        return new PageInfo(list);
//
    }
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public ChargeProject queryById(Integer chapId){
        return  chargeProjectMapper.selectByPrimaryKey(chapId);
    }
    //根据主键更新
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int updateById(ChargeProject chargeProject){
       return  chargeProjectMapper.updateByPrimaryKeySelective(chargeProject);}
    //根据主键删除
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer deleteById(Integer chapId){
       ChargeProject chargeProject = new ChargeProject();
        chargeProject.setChapId(chapId);
        chargeProject.setChapIsDel(1);     // 是否删除 0不删除 1删除
        chargeProject.setChapUpdateTime(new Date());
        return chargeProjectMapper.updateByPrimaryKeySelective(chargeProject);
    }
    //添加一个收费项目
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer addCharge(ChargeProject chargeProject){
        chargeProject.setChapCreateTime(new Date());
        return chargeProjectMapper.insertSelective(chargeProject);
    }
    }
