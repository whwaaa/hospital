package com.kkb.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/10/28/17:54
 */
public class ChargeQueryVo {
    private Integer chapId;
    private String chapName;
    private double chapMoney;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chapCreateTime;
    private String coach;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chapUpdateTime;
    private Integer chapIsDel;
    private Integer uId;

    @Override
    public String toString() {
        return "ChargeQueryVo{" +
                "chapId=" + chapId +
                ", chapName='" + chapName + '\'' +
                ", chapMoney=" + chapMoney +
                ", chapCreateTime=" + chapCreateTime +
                ", coach='" + coach + '\'' +
                ", chapUpdateTime=" + chapUpdateTime +
                ", chapIsDel=" + chapIsDel +
                ", uId=" + uId +
                '}';
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
        this.chapName = chapName;
    }

    public double getChapMoney() {
        return chapMoney;
    }

    public void setChapMoney(double chapMoney) {
        this.chapMoney = chapMoney;
    }

    public Date getChapCreateTime() {
        return chapCreateTime;
    }

    public void setChapCreateTime(Date chapCreateTime) {
        this.chapCreateTime = chapCreateTime;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Date getChapUpdateTime() {
        return chapUpdateTime;
    }

    public void setChapUpdateTime(Date chapUpdateTime) {
        this.chapUpdateTime = chapUpdateTime;
    }

    public Integer getChapIsDel() {
        return chapIsDel;
    }

    public void setChapIsDel(Integer chapIsDel) {
        this.chapIsDel = chapIsDel;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}
