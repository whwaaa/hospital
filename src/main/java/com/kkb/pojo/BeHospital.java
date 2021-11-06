package com.kkb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BeHospital implements Serializable {
    private Integer behId;

    private String behName;

    private String behNursePeople;

    private String behPatBed;

    private BigDecimal behAntecedent;

    private String behIllness;

    private Integer behClosePrice;

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
                ", behClosePrice=" + behClosePrice +
                ", behState=" + behState +
                ", behIsDel=" + behIsDel +
                ", behCreateTime=" + behCreateTime +
                ", behUpdateTime=" + behUpdateTime +
                ", uId=" + uId +
                '}';
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