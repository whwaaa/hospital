package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ChargeProject {
    private Integer chapId;

    private String chapName;

    private BigDecimal chapMoney;

    private Integer chapIsDel;

    private Date chapCreateTime;

    private Date chapUpdateTime;

    private Integer uId;

    public ChargeProject(){
        chapIsDel = 0;
    }

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