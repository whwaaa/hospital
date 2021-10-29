package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.User;
import com.kkb.service.UserService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.UserQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户的控制器层
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    // 多条件分页查询
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public AjaxResultVo<PageInfo> queryByPage(Integer pageNum, Integer pageSize, UserQueryVO userQueryVO){
        PageInfo<User> userPageInfo = userService.queryByPage(pageNum, pageSize, userQueryVO);
        if(userPageInfo != null){
            return new AjaxResultVo<>(200, "ok", userPageInfo);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键查询
    @RequestMapping(value = "{u_id}", method = RequestMethod.GET)
    public AjaxResultVo<User> queryById(@PathVariable("u_id") Integer u_id){
        User user = userService.queryById(u_id);
        if(user != null){
            return new AjaxResultVo<>(200, "ok", user);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据u_loginName查询,判断是否重复
    @RequestMapping(value = "loginname/{u_loginName}", method = RequestMethod.GET)
    public AjaxResultVo<User> queryById(@PathVariable("u_loginName") String u_loginName){
        User user = userService.queryByLoginName(u_loginName);
        if(user != null){
            return new AjaxResultVo<>(500, "用户名重复", user);
        }
        return new AjaxResultVo<>();
    }

    // 添加一条数据
    @RequestMapping(value = "", method = RequestMethod.POST)
    public AjaxResultVo<User> addUser(User user){
        Integer res = userService.addUser(user);
        if(res > 0){
            return new AjaxResultVo<>(201, "ok");
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键删除
    @RequestMapping(value = "{u_id}", method = RequestMethod.DELETE)
    public AjaxResultVo<User> deleteById(@PathVariable("u_id") Integer u_id){
        Integer res = userService.deleteById(u_id);
        if(res > 0){
            return new AjaxResultVo<>(204, "ok", null);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键更新
    @RequestMapping(value = "{u_id}", method = RequestMethod.PUT)
    public AjaxResultVo<User> updateById(@PathVariable("u_id") Integer u_id, User user){
        Integer res = userService.updateById(u_id, user);
        if(res > 0){
            return new AjaxResultVo<>(200, "ok", null);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }


}
