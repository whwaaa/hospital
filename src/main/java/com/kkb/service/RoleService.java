package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.RoleMapper;
import com.kkb.pojo.Role;
import com.kkb.pojo.RoleExample;
import com.kkb.vo.RoleQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * shandong-hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/31
 */
@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 新增role数据
     * @param role
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer add(Role role){
        role.setrCreateTime(new Date());
        return roleMapper.insertSelective(role);
    }

    /**
     * 根据主键删除角色 (逻辑删除)
     * @param rId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer delete(Integer rId){
        Role role = new Role();
        role.setrUpdateTime(new Date());
        role.setrIsDel(1);
        role.setrId(rId);
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    /**
     * 根据主键更新
     * @param rId
     * @param role
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer update(Integer rId, Role role){
        role.setrUpdateTime(new Date());
        role.setrId(rId);
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    /**
     * 多条件分页查询
     * @param pageNum
     * @param pageSize
     * @param roleQueryVo
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Role> queryPage(Integer pageNum, Integer pageSize, RoleQueryVo roleQueryVo){
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        // 添加查询条件
        if(roleQueryVo.getrName()!=null && !"".equals(roleQueryVo.getrName().trim())){
            criteria.andRNameLike("%" + roleQueryVo.getrName() + "%");
        }
        criteria.andRIsDelEqualTo(0);
        // 分页
        PageHelper.startPage(pageNum, pageSize);
        List<Role> roles = roleMapper.selectByExample(roleExample);
        return new PageInfo(roles);
    }

    /**
     * 通过主键查询
     * @param rId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Role queryByRId(Integer rId){
        return roleMapper.selectByPrimaryKey(rId);
    }
}











