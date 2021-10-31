package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Menu;
import com.kkb.service.MenuService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.MenuQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * shandong-hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/30
 */
@Controller
@ResponseBody
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    // 多条件分页查询
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public AjaxResultVo<PageInfo> queryByPage(Integer pageNum, Integer pageSize, MenuQueryVo menuQueryVo){
        if (pageNum == null || pageNum <=0){
            pageNum = 1;
        }
        if (pageSize == null || pageSize <=0){
            pageSize = 5;
        }
        PageInfo<Menu> menuPageInfo = menuService.queryByPage(pageNum, pageSize, menuQueryVo);
        if(menuPageInfo != null){
            return new AjaxResultVo<>(menuPageInfo);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键查询
    @RequestMapping(value = "{mId}", method = RequestMethod.GET)
    public AjaxResultVo<Menu> queryById(@PathVariable("mId") Integer mId){
        Menu menu = menuService.queryById(mId);
        if(menu != null){
            return new AjaxResultVo<>(menu);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 添加一条数据
    @RequestMapping(value = "", method = RequestMethod.POST)
    public AjaxResultVo<Menu> addMenu(Menu menu){
        Integer res = menuService.addMenu(menu);
        if(res > 0){
            return new AjaxResultVo<>(201, "ok");
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键删除
    @RequestMapping(value = "{mId}", method = RequestMethod.DELETE)
    public AjaxResultVo<Menu> deleteById(@PathVariable("mId") Integer mId){
        Integer res = menuService.deleteById(mId);
        if(res > 0){
            return new AjaxResultVo<>(204, "ok", null);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据主键更新
    @RequestMapping(value = "{mId}", method = RequestMethod.PUT)
    public AjaxResultVo<Menu> updateById(@PathVariable("mId") Integer mId, Menu menu){
        Integer res = menuService.updateById(mId, menu);
        if(res > 0){
            return new AjaxResultVo<>(200, "ok", null);
        }
        return new AjaxResultVo<>(500, "服务器内部异常, 请稍后再试!");
    }

    // 根据资源名查询
    @RequestMapping(value = "m-name/{mName}", method = RequestMethod.GET)
    public AjaxResultVo<Menu> queryByMName(@PathVariable("mName") String mName){
        List<Menu> menus = menuService.queryByMName(mName);
        if(menus.size() > 0){
            return new AjaxResultVo<>(500, "资源名已存在!");
        }
        return new AjaxResultVo<>();
    }

}
