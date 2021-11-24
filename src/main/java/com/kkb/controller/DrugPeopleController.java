package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DrugPeopleMapper;
import com.kkb.pojo.DrugPeople;
import com.kkb.service.DrugPeopleService;
import com.kkb.service.RegisterService;
import com.kkb.vo.AjaxResultVo;
import com.kkb.vo.RegisterQueryVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * show 处理在线发药相关的请求
 *
 * @author guguofu
 * @since 2021/11/17
 */
@ResponseBody
@RequestMapping("drugPeople")
@Controller
public class DrugPeopleController {

    @Resource
    private DrugPeopleService drugPeopleService;
    @Resource
    private RegisterService registerService;
    @Resource
    private DrugPeopleMapper drugPeopleMapper;
    /**
     * 查询挂号的病人信息
     *
     * @param vo
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "hosRegister/list", method = RequestMethod.GET)
    public AjaxResultVo getHosRegisterInfo(RegisterQueryVo vo, Integer pageNum, Integer pageSize) {
        // 分页数据初始化
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        PageInfo pageInfo = registerService.queryList(pageNum, pageSize, vo);
        return new AjaxResultVo(200, "查询成功", pageInfo);
    }

    /**
     * 添加买药订单
     *
     * @param hosrIds 挂号id，支持批量
     * @param drId    药品编号
     * @param num     数量
     * @return 添加情况
     */
    @RequestMapping(value = "addOrder", method = RequestMethod.POST)
    public AjaxResultVo addDrugOrder(@RequestParam("hosrIds[]") List<Integer> hosrIds, @RequestParam("drId") String drId,
                                     @RequestParam("num") Integer num) {
        int i = drugPeopleService.addDrugToHosRegisterOreder(hosrIds, drId, num);
        if (i > 0) {
            return new AjaxResultVo();
        } else if (i == -1) {
            return new AjaxResultVo(400, "当前剩余的库存不够，不能写入记录");
        }
        // i==0
        return new AjaxResultVo(400, "没有可添加的记录");
    }

    /**
     * 查询病人所有的买药记录
     *
     * @param hosrId   病人挂号id
     * @param pageNum  页码
     * @param pageSize 页大小
     * @return 返回查询的数据
     */
    @RequestMapping("/order/{hosrId}")
    public AjaxResultVo getDrugOrderList(@PathVariable("hosrId") Integer hosrId, Integer pageNum, Integer pageSize) {
        // 对于分页数据的初始化
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 10;
        }
        PageInfo<DrugPeople> pageInfo = drugPeopleService.getDrugPeopleByHosrIdPage(hosrId, pageNum, pageSize);
        return new AjaxResultVo(pageInfo);
    }

    /**
     * 病人购药交易请求
     *
     * @param drugPeoId 购药记录的主键
     * @param num       数量
     * @return 交易情况
     */
    @RequestMapping("given/{drugPeoId}")
    public AjaxResultVo givenToPeople(@PathVariable("drugPeoId") Integer drugPeoId, Integer num) {
        int i = drugPeopleService.givenDrugToPeople(drugPeoId, num);
        DrugPeople people = drugPeopleMapper.selectByPrimaryKey(drugPeoId);
        if (i > 0) {
            return new AjaxResultVo(200, "购买成功，当前挂号余额: " + people.getHosrRegPrice() + "元");
        } else if (i == -1) {
            return new AjaxResultVo(400, "病人的该购药记录不存在");
        } else if (i == -2) {
            return new AjaxResultVo(400, "购买的数量大于剩余可购买的数量，不允许购买");
        } else if (i == -3) {
            return new AjaxResultVo(400, "没有可购买的数量");
        } else if (i == -4) {
            return new AjaxResultVo(400, "挂号费用不足,目前余额为:" + people.getHosrRegPrice() + "元");
        }
        return new AjaxResultVo(400, "购买的数量大于可购的数量");
    }

}










