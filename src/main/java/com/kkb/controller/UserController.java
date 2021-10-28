package com.kkb.controller;

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
    public AjaxResultVo<User> queryByPage(Integer pageNum, Integer pageSize, UserQueryVO userQueryVO){
        return new AjaxResultVo<>(200, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键查询
    @RequestMapping(value = "{u_id}", method = RequestMethod.GET)
    public AjaxResultVo<User> queryById(@PathVariable("u_id") Integer u_id){
        return new AjaxResultVo<>(200, "服务器内部异常, 请稍后再试!");
    }

    // 添加一条数据
    @RequestMapping(value = "", method = RequestMethod.POST)
    public AjaxResultVo<User> addUser(User user){
        return new AjaxResultVo<>(200, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键删除
    @RequestMapping(value = "{u_id}", method = RequestMethod.DELETE)
    public AjaxResultVo<User> deleteById(@PathVariable("u_id") Integer u_id){
        return new AjaxResultVo<>(200, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键更新
    @RequestMapping(value = "{u_id}", method = RequestMethod.PUT)
    public AjaxResultVo<User> updateById(@PathVariable("u_id") Integer u_id){
        return new AjaxResultVo<>(200, "服务器内部异常, 请稍后再试!");
    }


}
