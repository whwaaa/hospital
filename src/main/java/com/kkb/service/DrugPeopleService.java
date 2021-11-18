package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.*;
import com.kkb.pojo.*;
import com.kkb.vo.RegisterQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * show 在线发药相关的业务处理类
 *
 * @author guguofu
 * @since 2021/11/16
 */
@Service
public class DrugPeopleService {

    @Resource
    private HosRegisterMapper hosRegisterMapper;
    @Resource
    private DrugPeopleMapper drugPeopleMapper;
    @Resource
    private DrugMapper drugMapper;
    @Resource
    private DoctorMapper doctorMapper;
    @Resource
    private UserMapper userMapper;

    /**
     * 显示挂号病人信息，支持姓名和挂号编码模糊查询
     *
     * @param pageNum  页码
     * @param pageSize 页大小
     * @param vo       查询条件
     * @return 分页数据
     */
    public PageInfo<HosRegister> gethosRegisterByPage(Integer pageNum, Integer pageSize, RegisterQueryVo vo) {
        PageHelper.startPage(pageNum, pageSize);
        HosRegisterExample example = new HosRegisterExample();
        // 设置条件
        if (vo != null) {
            HosRegisterExample.Criteria criteria = example.createCriteria();
            // 挂号的主键
            if (!StringUtils.isEmpty(vo.getHosrId().trim())) {
                criteria.andHosrIdcarLike("%" + vo.getHosrId().trim() + "%");
            }
            // 病人名字
            if (!StringUtils.isEmpty(vo.getHosrName().trim())) {
                criteria.andHosrNameLike("%" + vo.getHosrName().trim() + "%");
            }
        }
        List<HosRegister> hosRegisters = hosRegisterMapper.selectByExample(example);
        for (HosRegister hosReg : hosRegisters) {
            // 遍历查询医生信息
            Doctor doctor = doctorMapper.selectByPrimaryKey(hosReg.getdId());
            User user = userMapper.selectByPrimaryKey(doctor.getuId());
            // 获取医生姓名
            hosReg.setDoctorName(user.getuTrueName());
        }
        return new PageInfo<>(hosRegisters);
    }

    /**
     * 病人录入待购买药品，支持单个人和多个人的购买，需要关联库存
     *
     * @param hosrIds 挂号id
     * @param drId    药品编码
     * @param num     预购数量
     * @return 记录情况
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int addDrugToHosRegisterOreder(Integer[] hosrIds, String drId, Integer num) {
        if (hosrIds != null && hosrIds.length > 0) {
            // 库存判断
            int n = hosrIds.length * num;
            Drug drug = drugMapper.selectByPrimaryKey(drId);
            if (drug.getDrNumber() < n) {
                return -1;
            }
            // 批量添加,可以改成sql
            for (Integer hosrId : hosrIds) {
                DrugPeople drugPeople = new DrugPeople();
                drugPeople.setHosrId(hosrId);
                drugPeople.setDrugId(drId);
                drugPeople.setDrugNumber(num);
                drugPeople.setDrugGiveNumber(0);
                drugPeopleMapper.insertSelective(drugPeople);
            }
            return hosrIds.length;
        }
        return 0;
    }

    /**
     * 查询病人所有的买药记录，按主键倒叙，即后续的录入的数据在前面
     *
     * @param hosrId   病人挂号id
     * @param pageNum  页码
     * @param pageSize 页数
     * @return 分页对象
     */
    public PageInfo<DrugPeople> getDrugPeopleByHosrIdPage(Integer hosrId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DrugPeople> list = drugPeopleMapper.selectByPrimaryKeyWithInfo(hosrId);
        for (DrugPeople dp : list) {
            dp.setDrugLastNumber(dp.getDrugNumber() - dp.getDrugGiveNumber());
        }
        return new PageInfo<>(list);
    }

    /**
     * 病人买入药品，支持买入数量可变，但是不允许超过预定的药品数量,还需要考虑病人的挂号费是否够支付
     *
     * @param drugPeoId 购买记录的主键
     * @param num       购买数量
     * @return 购买情况，-1表示没有找到该病人的购买记录，-2表示购买的数量大于剩余可够数量，1表示购买成功
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int givenDrugToPeople(Integer drugPeoId, Integer num) {
        DrugPeople people = drugPeopleMapper.selectByPrimaryKey(drugPeoId);
        // 病人不存在
        if (people == null) {
            return -1;
        }
        // 剩余可购买的数量
        int subNum = people.getDrugNumber() - people.getDrugGiveNumber();
        if (subNum > 0 && subNum >= num) {
            people.setDrugGiveNumber(people.getDrugGiveNumber() + num);
        } else if (subNum <= 0) {
            // 没有可购买的数量
            return -3;
        } else {
            // 购买的数量大于剩余可购买的数量，不允许购买
            return -2;
        }
        // 挂号的费用是否能够支付药品总费用
        BigDecimal numDec = new BigDecimal(num.toString());
        BigDecimal totlaPay = numDec.multiply(people.getDrOutprice());
        if (totlaPay.compareTo(people.getHosrRegPrice())>0){
            // 挂号费用不足以支付药品的配用
            return -4 ;
        }
        // 更新购买记录
        int i = drugPeopleMapper.updateByPrimaryKeySelective(people);
        // 挂号费用减少
        int j = hosRegisterMapper.updateByPrimaryKeySelective(new HosRegister(people.getHosrId(),people.getHosrRegPrice().subtract(totlaPay)));
        return j;
    }

}














