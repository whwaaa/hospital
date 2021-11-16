package com.kkb.pojo;

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
    // 病人挂号表
    private Integer hosrId;
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
}