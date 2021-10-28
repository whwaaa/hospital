package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.UserMapper;
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
 * Shandong_Hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

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
        if(userQueryVO.getU_loginName()!=null && !"".equals(userQueryVO.getU_loginName())){
            criteria.andU_loginNameLike("%" + userQueryVO.getU_loginName() + "%");
        }
        criteria.andU_isDelEqualTo(0);  // 是否删除 0不删除 1删除
        // ...

        // 分页
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.selectByExample(userExample);
        return new PageInfo<>(users);
    }

    /**
     * 添加一条数据
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer addUser(User user){
        user.setU_create_time(new Date());
        return userMapper.insert(user);
    }

    /**
     * 根据主键查询
     * @param u_id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public User queryById(Integer u_id){
        return userMapper.selectByPrimaryKey(u_id);
    }

    /**
     * 根据主键更新
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer updateById(Integer u_id, User user){
        user.setU_id(u_id);
        user.setU_update_time(new Date());
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 根据主键删除
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public Integer deleteById(Integer u_id){
        User user = new User();
        user.setU_id(u_id);
        user.setU_isDel(1);     // 是否删除 0不删除 1删除
        user.setU_update_time(new Date());
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
