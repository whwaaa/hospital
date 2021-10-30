package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.ChargeProjectMapper;
import com.kkb.pojo.ChargeProject;
import com.kkb.pojo.ChargeProjectExample;
import com.kkb.vo.ChargeQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
        PageHelper.startPage(pageNum,pageSize);
        List<ChargeProject> list = chargeProjectMapper.selectByExample(chargeProjectExample);
        return new PageInfo<ChargeProject>(list);
    }
}
