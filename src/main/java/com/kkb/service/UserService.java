package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.RoleMapper;
import com.kkb.mapper.UserMapper;
import com.kkb.pojo.Role;
import com.kkb.pojo.User;
import com.kkb.pojo.UserExample;
import com.kkb.vo.UserQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * UserService
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 多条件查询
     * @param pageNum
     * @param pageSize
     * @param userQueryVO
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<User> queryByPage(Integer pageNum, Integer pageSize, UserQueryVO userQueryVO){
        // 创建多条件查询对象
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        // 添加多条件
        if(userQueryVO.getuLoginName()!=null && !"".equals(userQueryVO.getuLoginName())){
            criteria.andULoginNameLike("%" + userQueryVO.getuLoginName() + "%");
        }
        criteria.andUIsDelEqualTo(0);  // 是否删除 0不删除 1删除
        // 分页
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.selectByExample(userExample);
        System.out.println(users);
        for (User user : users) {
            if(user.getrId() != null){
                Role role = roleMapper.selectByPrimaryKey(user.getrId());
                user.setRole(role);
            }
        }
        return new PageInfo<>(users);
    }

    /**
     * 添加一条数据
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer addUser(User user){
        user.setuCreateTime(new Date());
        return userMapper.insertSelective(user);
    }

    /**
     * 根据主键查询
     * @param uId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public User queryById(Integer uId){
        return userMapper.selectByPrimaryKey(uId);
    }

    /**
     * 根据用户名查询
     * @param uLoginName
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public User queryByLoginName(String uLoginName){
        if(uLoginName == null || "".equals(uLoginName))
            return null;
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andULoginNameEqualTo(uLoginName);
        criteria.andUIsDelEqualTo(0);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size() != 0){
            return users.get(0);
        }
        return null;
    }

    /**
     * 根据主键更新
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer updateById(Integer uId, User user){
        user.setuId(uId);
        user.setuUpdateTime(new Date());
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 根据主键删除
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer deleteById(Integer uId){
        User user = new User();
        user.setuId(uId);
        user.setuIsDel(1);     // 是否删除 0不删除 1删除
        user.setuUpdateTime(new Date());
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
