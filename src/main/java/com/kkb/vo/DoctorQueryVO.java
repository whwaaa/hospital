package com.kkb.vo;

import com.kkb.pojo.User;

import java.util.Date;

public class DoctorQueryVO {
    private Integer dId;//医生编号
    private User user;//获取用户姓名
    private String dKeshi;//医生所在科室

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getdKeshi() {
        return dKeshi;
    }

    public void setdKeshi(String dKeshi) {
        this.dKeshi = dKeshi;
    }

}
