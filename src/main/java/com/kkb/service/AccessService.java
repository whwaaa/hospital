package com.kkb.service;

import com.kkb.mapper.MenuMapper;
import com.kkb.mapper.RoleMenuMapper;
import com.kkb.mapper.UserMapper;
import com.kkb.pojo.*;
import com.kkb.utils.JWTUtil;
import com.kkb.vo.AjaxResultVo;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 创建token存入cookie
     * @param response
     * @param user
     * @return
     */
    public AjaxResultVo createToken(HttpServletResponse response, User user){
        // 将用户id,用户名,角色id称封装为map集合
        Map<String, Object> payLoadMap = new HashMap<>();
        payLoadMap.put(JWTUtil.payLoadUserId, user.getuId());
        payLoadMap.put(JWTUtil.payLoadLoginName, user.getuLoginName());
        payLoadMap.put(JWTUtil.payLoadRoleId, user.getrId());
        // 传入map参数, 生成jwtToken令牌
        String jwtToken = JWTUtil.generToken(payLoadMap);
        // 将jwt令牌存入cookie
        Cookie cookie = new Cookie("jwtToken", jwtToken);
        cookie.setPath("/");
        cookie.setMaxAge(3*24*60*60);     // 设置过期时间3天 3*24*60*60秒
        response.addCookie(cookie);
        return new AjaxResultVo();
    }

    /**
     * 解析用户信息
     * @param request
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public User paseUserMessage(HttpServletRequest request){
        // 获取cookie
        Cookie[] cookies = request.getCookies();
        String jwtToken = null;
        // 遍历cookie
        if(cookies != null){
            for (Cookie cookie : cookies) {
                // 查找name=jwtToken的cookie
                if(cookie.getName()!=null && "jwtToken".equals(cookie.getName())){
                    jwtToken = cookie.getValue();
                }
            }
        }
        // 解析jwtToken
        Claims claims = JWTUtil.verifyToken(jwtToken);
        // 解析用户信息
        String uLoginName = claims.get(JWTUtil.payLoadLoginName).toString();
        String uId = claims.get(JWTUtil.payLoadUserId).toString();
        String rId = claims.get(JWTUtil.payLoadRoleId).toString();
        // 查询rId所拥有的所有资源mId
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = roleMenuExample.createCriteria();
        criteria.andRIdEqualTo(Integer.parseInt(rId));
        List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(roleMenuExample);
        List<Menu> menuList = new ArrayList<>();
        // 遍历所有资源mId
        for (RoleMenu roleMenu : roleMenus) {
            // 查询获取每一个资源id的详细资源信息
            Menu menu = menuMapper.selectByPrimaryKey(roleMenu.getmId());
            // 资源可用再添加
            if(menu.getmState() == 0)
                menuList.add(menu);
        }
        // 将查询到的所有资源信息封装到user对象
        User user = new User();
        user.setuLoginName(uLoginName);
        user.setuId(Integer.parseInt(uId));
        user.setMenuList(menuList);
        return user;
    }

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

    /**
     * 根据用id和密码查询用户
     * @param user
     * @return : 用户名和密码任意一项为空则返回null, 否则返回查询结果
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<User> queryByUserIdAndPassword(User user){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        // 用户id为空返回null
        if(user.getuId() != null){
            criteria.andUIdEqualTo(user.getuId());
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
