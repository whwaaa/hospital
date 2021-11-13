package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DrugMapper;
import com.kkb.pojo.Drug;
import com.kkb.pojo.DrugExample;
import com.kkb.vo.DrugQueryVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * show 药品业务类
 *
 * @author guguofu
 * @since 2021/10/31
 */
@Service
public class DrugService {

    @Resource
    private DrugMapper drugMapper;

    /**
     * 新增药品
     *
     * @param drug 药品信息
     * @return 新增情况，0表示新增失败，1表示新增成功
     */
    public int addDrug(Drug drug) {
        if (drug == null)
            return 0;
        // 新增的药品未删除
        drug.setDrIsDel(0);
        // 默认库存为0
        drug.setDrNumber(0);
        return drugMapper.insertSelective(drug);
    }

    /**
     * 添加药品库存--更新药品的库存数量
     * @param drId 药品编号
     * @param drNumber 添加的数量
     * @return 添加情况.-1表示没有当前的药品，1表示添加成功，其他表示添加失败
     */
    public int addDrugNumber(String drId, int drNumber) {
        Drug drug = drugMapper.selectByPrimaryKey(drId);
        if (drug==null)
            return -1;
        Integer drNumber1 = drug.getDrNumber();
        if (drNumber1==null)
            drNumber1 = 0;
        drug.setDrNumber(drNumber1+drNumber);
        return drugMapper.updateByPrimaryKeySelective(drug);
    }

    /**
     *  更新药品信息
     * @param drug 待更新的信息
     * @return 更新情况.-1表示没有当前的药品，1表示更新成功，其他表示更新失败
     */
    public int updateDrug(Drug drug) {
        if (drug==null||drug.getDrId()==null)
            return -1;
        return drugMapper.updateByPrimaryKeySelective(drug);
    }

    /**
     * 通过药品编码查询药品信息
     * @param drId 药品编码
     * @return 查询的药品信息
     */
    public Drug findDrugById(String drId) {
        // 对于前后空格的处理
        String drIdTrim = drId.trim();
        if (drIdTrim.length()==0)
            return null;
        return drugMapper.selectByPrimaryKey(drIdTrim);
    }

    /**
     * 多条件分页查询药品列表
     *
     * @param vo       查询条件
     * @param pageNum  页码
     * @param pageSize 页大小
     * @return 查询结果
     */
    public PageInfo<Drug> findDrugByPage(DrugQueryVo vo, int pageNum, int pageSize) {
        List<Drug> drugs = null;
        // 如果pageNum || pageSize小于0，不进行分页
        if (pageNum > 0 || pageSize > 0) {
            PageHelper.startPage(pageNum,pageSize);
        }
        if (vo!=null){
            // 条件
            DrugExample drugExample = new DrugExample();
            DrugExample.Criteria criteria = drugExample.createCriteria();
            // 药品名称
            if (vo.getDrName()!=null&&!"".equals(vo.getDrName())){
                criteria.andDrNameLike("%"+vo.getDrName()+"%");
            }
            // 药品类型
            if (vo.getDrType()!=null&&!"".equals(vo.getDrType())){
                criteria.andDrTypeEqualTo(vo.getDrType());
            }
            drugs = drugMapper.selectByExample(drugExample);
        }else {
            // 查找全部
            drugs = drugMapper.selectByExample(null);
        }
        return new PageInfo<>(drugs);
    }

    /**
     * 根据药品编码集合查询药品信息
     *
     * @param drIds 待查询的药品编码集合
     * @return 返回查询结果
     */
    public List<Drug> findDrugByIdList(List<String> drIds){
        if (drIds ==null|| drIds.size()==0)
            return null;
        return drugMapper.selectByIdList(drIds);
    }

}
