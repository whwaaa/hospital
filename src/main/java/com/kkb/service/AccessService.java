package com.kkb.service;

import com.kkb.mapper.UserMapper;
import com.kkb.pojo.User;
import com.kkb.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * AccessService
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@Service
public class AccessService {

    @Autowired
    private UserMapper userMapper;


    /**
     * 根据用户名和密码查询用户
     * @param user
     * @return : 用户名和密码任意一项为空则返回null, 否则返回查询结果
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<User> queryByUserNameAndPassword(User user){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        // 用户名为空返回null
        if(user.getuLoginName() != null && !"".equals(user.getuLoginName())){
            criteria.andULoginNameEqualTo(user.getuLoginName());
        }else{
            return null;
        }
        // 密码为空返回null
        if(user.getuPassword() != null && !"".equals(user.getuPassword())){
            criteria.andUPasswordEqualTo(user.getuPassword());
        }else{
            return null;
        }
        criteria.andUIsDelEqualTo(0);
        return userMapper.selectByExample(userExample);
    }
}
