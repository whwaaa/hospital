package com.kkb.pojo;

import java.math.BigDecimal;

/**
 * show 病人购买药品记录表实体类
 *
 * @author guguofu
 * @since 2021/11/16
 */
public class DrugPeople {
    // 主键
    private Integer drugPeoId;
    // 药品的编号
    private String drugId;
    // 关联药品名称
    private String drName;
    // 病人挂号表
    private Integer hosrId;
    // 病人姓名
    private String hosrName;
    // 病人的押金
    private BigDecimal hosrRegPrice;
    // 单价（元）
    private BigDecimal drOutprice;
    // 预购数量
    private Integer drugNumber;
    // 已购数量
    private Integer drugGiveNumber;

    public Integer getDrugPeoId() {
        return drugPeoId;
    }

    public void setDrugPeoId(Integer drugPeoId) {
        this.drugPeoId = drugPeoId;
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId == null ? null : drugId.trim();
    }

    public Integer getHosrId() {
        return hosrId;
    }

    public void setHosrId(Integer hosrId) {
        this.hosrId = hosrId;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }

    public Integer getDrugGiveNumber() {
        return drugGiveNumber;
    }

    public void setDrugGiveNumber(Integer drugGiveNumber) {
        this.drugGiveNumber = drugGiveNumber;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getHosrName() {
        return hosrName;
    }

    public void setHosrName(String hosrName) {
        this.hosrName = hosrName;
    }

    public BigDecimal getHosrRegPrice() {
        return hosrRegPrice;
    }

    public void setHosrRegPrice(BigDecimal hosrRegPrice) {
        this.hosrRegPrice = hosrRegPrice;
    }

    public BigDecimal getDrOutprice() {
        return drOutprice;
    }

    public void setDrOutprice(BigDecimal drOutprice) {
        this.drOutprice = drOutprice;
    }
}