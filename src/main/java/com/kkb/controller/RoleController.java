package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Role;
import com.kkb.service.RoleService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.RoleQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * shandong-hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/31
 */
@Controller
@RequestMapping("role")
@ResponseBody
public class RoleController {

    @Autowired
    private RoleService roleService;

    // 添加一条数据
    @RequestMapping(value = "", method = RequestMethod.POST)
    public AjaxResultVo<Role> add(Role role){
        Integer res = roleService.add(role);
        if(res != 0){
            return new AjaxResultVo<>(201, "ok");
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键删除
    @RequestMapping(value = "{rId}", method = RequestMethod.DELETE)
    public AjaxResultVo<Role> delete(@PathVariable("rId") Integer rId){
        Integer delete = roleService.delete(rId);
        if(delete != 0){
            return new AjaxResultVo<>(204, "ok");
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键更新
    @RequestMapping(value = "{rId}", method = RequestMethod.PUT)
    public AjaxResultVo<Role> update(@PathVariable("rId") Integer rId, Role role){
        Integer update = roleService.update(rId, role);
        if(update != 0){
            return new AjaxResultVo<>();
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 多条件分页查询
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public AjaxResultVo<Role> queryPage(Integer pageNum, Integer pageSize, RoleQueryVo roleQueryVo){
        if (pageNum == null || pageNum <=0){
            pageNum = 1;
        }
        if (pageSize == null || pageSize <=0){
            pageSize = 5;
        }
        PageInfo<Role> rolePageInfo = roleService.queryPage(pageNum, pageSize, roleQueryVo);
        if(rolePageInfo != null){
            return new AjaxResultVo<>(200, "ok", rolePageInfo);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键查询
    @RequestMapping(value = "{rId}", method = RequestMethod.GET)
    public AjaxResultVo<Role> queryByRId(@PathVariable("rId") Integer rId){
        Role role = roleService.queryByRId(rId);
        if(role != null){
            return new AjaxResultVo<>(200, "ok", role);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据角色名称查重
    @RequestMapping(value = "r-name/{rName}", method = RequestMethod.GET)
    public AjaxResultVo<Role> queryByRName(@PathVariable("rName") String rName){

        return new AjaxResultVo<>();
    }

}

































