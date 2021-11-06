package com.kkb.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/10/28/17:54
 */
public class CkChargeQueryVo {
    private Integer behId;

    private String behName;

    private String behNursePeople;

    private String behPatBed;

    private BigDecimal behAntecedent;

    private String behIllness;

    private Integer behClosePrice;

    private Integer behState;

    private Integer behIsDel;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date behCreateTime;

    @Override
    public String toString() {
        return "CkChargeQueryVo{" +
                "behId=" + behId +
                ", behName='" + behName + '\'' +
                ", behNursePeople='" + behNursePeople + '\'' +
                ", behPatBed='" + behPatBed + '\'' +
                ", behAntecedent=" + behAntecedent +
                ", behIllness='" + behIllness + '\'' +
                ", behClosePrice=" + behClosePrice +
                ", behState=" + behState +
                ", behIsDel=" + behIsDel +
                ", behCreateTime=" + behCreateTime +
                ", behUpdateTime=" + behUpdateTime +
                ", uId=" + uId +
                '}';
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date behUpdateTime;

    private Integer uId;

    public Integer getBehId() {
        return behId;
    }

    public void setBehId(Integer behId) {
        this.behId = behId;
    }

    public String getBehName() {
        return behName;
    }

    public void setBehName(String behName) {
        this.behName = behName;
    }

    public String getBehNursePeople() {
        return behNursePeople;
    }

    public void setBehNursePeople(String behNursePeople) {
        this.behNursePeople = behNursePeople;
    }

    public String getBehPatBed() {
        return behPatBed;
    }

    public void setBehPatBed(String behPatBed) {
        this.behPatBed = behPatBed;
    }

    public BigDecimal getBehAntecedent() {
        return behAntecedent;
    }

    public void setBehAntecedent(BigDecimal behAntecedent) {
        this.behAntecedent = behAntecedent;
    }

    public String getBehIllness() {
        return behIllness;
    }

    public void setBehIllness(String behIllness) {
        this.behIllness = behIllness;
    }

    public Integer getBehClosePrice() {
        return behClosePrice;
    }

    public void setBehClosePrice(Integer behClosePrice) {
        this.behClosePrice = behClosePrice;
    }

    public Integer getBehState() {
        return behState;
    }

    public void setBehState(Integer behState) {
        this.behState = behState;
    }

    public Integer getBehIsDel() {
        return behIsDel;
    }

    public void setBehIsDel(Integer behIsDel) {
        this.behIsDel = behIsDel;
    }

    public Date getBehCreateTime() {
        return behCreateTime;
    }

    public void setBehCreateTime(Date behCreateTime) {
        this.behCreateTime = behCreateTime;
    }

    public Date getBehUpdateTime() {
        return behUpdateTime;
    }

    public void setBehUpdateTime(Date behUpdateTime) {
        this.behUpdateTime = behUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}
