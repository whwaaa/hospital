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
        if(user.getU_loginName() != null && !"".equals(user.getU_loginName())){
            criteria.andU_loginNameEqualTo(user.getU_loginName());
        }else{
            return null;
        }
        // 密码为空返回null
        if(user.getU_passWord() != null && !"".equals(user.getU_passWord())){
            criteria.andU_passWordEqualTo(user.getU_passWord());
        }else{
            return null;
        }
        criteria.andU_isDelEqualTo(0);
        return userMapper.selectByExample(userExample);
    }
}
