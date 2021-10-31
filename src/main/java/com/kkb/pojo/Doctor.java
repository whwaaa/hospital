package com.kkb.pojo;

import java.util.Date;

public class Doctor {
    private Integer dId;

    private String dIdCar;

    private String dPhone;

    private String dTelphone;

    private Integer dSex;

    private Date dBirthday;

    private Integer dAge;

    private String dEmail;

    private String dKeshi;

    private String dXueli;

    private String dDesc;

    private Date dIntime;

    private Integer dState;

    private Integer dIsDel;

    private Date dCreateTime;

    private Date dUpdateTime;

    private Integer uId;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdIdCar() {
        return dIdCar;
    }

    public void setdIdCar(String dIdCar) {
        this.dIdCar = dIdCar == null ? null : dIdCar.trim();
    }

    public String getdPhone() {
        return dPhone;
    }

    public void setdPhone(String dPhone) {
        this.dPhone = dPhone == null ? null : dPhone.trim();
    }

    public String getdTelphone() {
        return dTelphone;
    }

    public void setdTelphone(String dTelphone) {
        this.dTelphone = dTelphone == null ? null : dTelphone.trim();
    }

    public Integer getdSex() {
        return dSex;
    }

    public void setdSex(Integer dSex) {
        this.dSex = dSex;
    }

    public Date getdBirthday() {
        return dBirthday;
    }

    public void setdBirthday(Date dBirthday) {
        this.dBirthday = dBirthday;
    }

    public Integer getdAge() {
        return dAge;
    }

    public void setdAge(Integer dAge) {
        this.dAge = dAge;
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail == null ? null : dEmail.trim();
    }

    public String getdKeshi() {
        return dKeshi;
    }

    public void setdKeshi(String dKeshi) {
        this.dKeshi = dKeshi == null ? null : dKeshi.trim();
    }

    public String getdXueli() {
        return dXueli;
    }

    public void setdXueli(String dXueli) {
        this.dXueli = dXueli == null ? null : dXueli.trim();
    }

    public String getdDesc() {
        return dDesc;
    }

    public void setdDesc(String dDesc) {
        this.dDesc = dDesc == null ? null : dDesc.trim();
    }

    public Date getdIntime() {
        return dIntime;
    }

    public void setdIntime(Date dIntime) {
        this.dIntime = dIntime;
    }

    public Integer getdState() {
        return dState;
    }

    public void setdState(Integer dState) {
        this.dState = dState;
    }

    public Integer getdIsDel() {
        return dIsDel;
    }

    public void setdIsDel(Integer dIsDel) {
        this.dIsDel = dIsDel;
    }

    public Date getdCreateTime() {
        return dCreateTime;
    }

    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    public Date getdUpdateTime() {
        return dUpdateTime;
    }

    public void setdUpdateTime(Date dUpdateTime) {
        this.dUpdateTime = dUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}