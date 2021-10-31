package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.MenuMapper;
import com.kkb.pojo.*;
import com.kkb.vo.MenuQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * shandong-hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/30
 */
@Service
public class MenuService {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 多条件查询
     * @param pageNum
     * @param pageSize
     * @param menuQueryVo
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Menu> queryByPage(Integer pageNum, Integer pageSize, MenuQueryVo menuQueryVo){
        // 创建多条件查询对象
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria criteria = menuExample.createCriteria();
        // 添加多条件
        if(menuQueryVo.getmName()!=null && !"".equals(menuQueryVo.getmName().trim())){
            criteria.andMNameLike("%" + menuQueryVo.getmName() + "%");
        }
        // 分页
        PageHelper.startPage(pageNum, pageSize);
        List<Menu> menus = menuMapper.selectByExample(menuExample);
        return new PageInfo<>(menus);
    }

    /**
     * 添加一条数据
     * @param menu
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer addMenu(Menu menu){
        return menuMapper.insert(menu);
    }

    /**
     * 根据主键查询
     * @param mId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Menu queryById(Integer mId){
        return menuMapper.selectByPrimaryKey(mId);
    }

    /**
     * 删除一条数据
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer deleteById(Integer mId){
        return menuMapper.deleteByPrimaryKey(mId);
    }

    /**
     * 根据主键更新
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer updateById(Integer mId, Menu menu){
        menu.setmId(mId);
        return menuMapper.updateByPrimaryKeySelective(menu);
    }

    /**
     * 根据资源名查询资源
     * @param mName
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<Menu> queryByMName(String mName){
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria criteria = menuExample.createCriteria();
        criteria.andMNameEqualTo(mName);
        return menuMapper.selectByExample(menuExample);
    }
}
