package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.MenuMapper;
import com.kkb.pojo.*;
import com.kkb.vo.MenuQueryVo;
import com.kkb.vo.UserQueryVO;
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
        if(menuQueryVo.getM_name()!=null && !"".equals(menuQueryVo.getM_name())){
            criteria.andM_nameLike("%" + menuQueryVo.getM_name() + "%");
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
     * @param m_id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Menu queryById(Integer m_id){
        return menuMapper.selectByPrimaryKey(m_id);
    }

    /**
     * 删除一条数据
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer deleteById(Integer m_id){
        return menuMapper.deleteByPrimaryKey(m_id);
    }

    /**
     * 根据主键更新
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer updateById(Integer m_id, Menu menu){
        menu.setM_id(m_id);
        return menuMapper.updateByPrimaryKeySelective(menu);
    }
}
