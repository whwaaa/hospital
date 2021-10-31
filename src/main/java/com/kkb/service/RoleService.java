package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.RoleMapper;
import com.kkb.mapper.RoleMenuMapper;
import com.kkb.pojo.Role;
import com.kkb.pojo.RoleExample;
import com.kkb.pojo.RoleMenu;
import com.kkb.pojo.RoleMenuExample;
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

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    /**
     * 新增role数据
     * @param role
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer add(Role role){
        // 添加到role表
        role.setrCreateTime(new Date());
        int i = roleMapper.insertSelective(role);
        if(role.getMenuIds()!=null && !"".equals(role.getMenuIds().trim()) && i>0){
            // 添加到RoleMenu表
            // 解析menuIds
            String[] menuIds = role.getMenuIds().split("_");
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setrId(role.getrId());
            for (String menuId : menuIds) {
                int mId;
                try {
                    // TODO: 此处可抛全局异常处理, 待后期处理
                    mId = Integer.parseInt(menuId);
                } catch (NumberFormatException e) {
                    return 0;
                }
                roleMenu.setmId(mId);
                roleMenuMapper.insertSelective(roleMenu);
            }
        }
        return i;
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
        // 更新role表
        role.setrUpdateTime(new Date());
        role.setrId(rId);
        int i = roleMapper.updateByPrimaryKeySelective(role);
        if(role.getMenuIds()!=null && !"".equals(role.getMenuIds().trim())){
            // 更新role与menu中间表
            RoleMenuExample roleMenuExample = new RoleMenuExample();
            RoleMenuExample.Criteria criteria = roleMenuExample.createCriteria();
            criteria.andRIdEqualTo(rId);
            // 先删除
            roleMenuMapper.deleteByExample(roleMenuExample);
            // 再添加
            String[] menuIds = role.getMenuIds().split("_");
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setrId(rId);
            for (String menuId : menuIds) {
                int mId;
                try {
                    // TODO: 此处可抛全局异常处理, 待后期处理
                    mId = Integer.parseInt(menuId);
                } catch (NumberFormatException e) {
                    return 0;
                }
                roleMenu.setmId(mId);
                roleMenuMapper.insertSelective(roleMenu);
            }
        }
        return i;
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
        // 查询role对象
        Role role = roleMapper.selectByPrimaryKey(rId);
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = roleMenuExample.createCriteria();
        // 根据rId查询role与menu的中间表
        criteria.andRIdEqualTo(rId);
        List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(roleMenuExample);
        // 将结果添加进role对象返回
        role.setRoleMenuList(roleMenus);
        return role;
    }

    /**
     * 通过rName查询
     * @param rName
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<Role> queryByRName(String rName){
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andRNameEqualTo(rName);
        criteria.andRIsDelEqualTo(0);
        return roleMapper.selectByExample(roleExample);
    }
}











