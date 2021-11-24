package com.kkb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BeHospital implements Serializable {
    private Integer behId;

    // 住院人姓名
    @NotBlank(message = "住院人姓名不能为空")
    private String behName;
    // 护理人
    @NotBlank(message = "护理人不能为空")
    private String behNursePeople;
    // 病床号
    @NotBlank(message = "病床号不能为空")
    private String behPatBed;
    // 缴纳金额
    @NotBlank(message = "缴纳金额不能为空")
    private BigDecimal behAntecedent;
    // 病情介绍
    @NotBlank(message = "病情介绍不能为空")
    private String behIllness;
    private BigDecimal blank;

    public BigDecimal getBlank() {
        return blank;
    }

    public void setBlank(BigDecimal blank) {
        this.blank = blank;
    }
    // 结算状态：0未结算 1已结算
    @NotNull
    @Size(max = 1)
    private Integer behClosePrice;
    // 信息状态:  暂不用
    private Integer behState;

    private Integer behIsDel;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date behCreateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date behUpdateTime;

    private Integer uId;

    @Override
    public String toString() {
        return "BeHospital{" +
                "behId=" + behId +
                ", behName='" + behName + '\'' +
                ", behNursePeople='" + behNursePeople + '\'' +
                ", behPatBed='" + behPatBed + '\'' +
                ", behAntecedent=" + behAntecedent +
                ", behIllness='" + behIllness + '\'' +
                ", blank=" + blank +
                ", behClosePrice=" + behClosePrice +
                ", behState=" + behState +
                ", behIsDel=" + behIsDel +
                ", behCreateTime=" + behCreateTime +
                ", behUpdateTime=" + behUpdateTime +
                ", uId=" + uId +
                '}';
    }
    private BigDecimal allCast;

    public BigDecimal getAllCast() {
        return allCast;
    }

    public void setAllCast(BigDecimal allCast) {
        this.allCast = allCast;
    }

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
        this.behName = behName == null ? null : behName.trim();
    }

    public String getBehNursePeople() {
        return behNursePeople;
    }

    public void setBehNursePeople(String behNursePeople) {
        this.behNursePeople = behNursePeople == null ? null : behNursePeople.trim();
    }

    public String getBehPatBed() {
        return behPatBed;
    }

    public void setBehPatBed(String behPatBed) {
        this.behPatBed = behPatBed == null ? null : behPatBed.trim();
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
        this.behIllness = behIllness == null ? null : behIllness.trim();
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