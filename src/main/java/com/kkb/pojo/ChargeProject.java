package com.kkb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class ChargeProject {
    private Integer chapId;

    private String chapName;

    private BigDecimal chapMoney;

    private Integer chapIsDel;

    @Override
    public String toString() {
        return "ChargeProject{" +
                "chapId=" + chapId +
                ", chapName='" + chapName + '\'' +
                ", chapMoney=" + chapMoney +
                ", chapIsDel=" + chapIsDel +
                ", chapCreateTime=" + chapCreateTime +
                ", chapUpdateTime=" + chapUpdateTime +
                ", uId=" + uId +
                '}';
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chapCreateTime;

    private Date chapUpdateTime;

    private Integer uId;

    public Integer getChapId() {
        return chapId;
    }

    public void setChapId(Integer chapId) {
        this.chapId = chapId;
    }

    public String getChapName() {
        return chapName;
    }

    public void setChapName(String chapName) {
        this.chapName = chapName == null ? null : chapName.trim();
    }

    public BigDecimal getChapMoney() {
        return chapMoney;
    }

    public void setChapMoney(BigDecimal chapMoney) {
        this.chapMoney = chapMoney;
    }

    public Integer getChapIsDel() {
        return chapIsDel;
    }

    public void setChapIsDel(Integer chapIsDel) {
        this.chapIsDel = chapIsDel;
    }

    public Date getChapCreateTime() {
        return chapCreateTime;
    }

    public void setChapCreateTime(Date chapCreateTime) {
        this.chapCreateTime = chapCreateTime;
    }

    public Date getChapUpdateTime() {
        return chapUpdateTime;
    }

    public void setChapUpdateTime(Date chapUpdateTime) {
        this.chapUpdateTime = chapUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}