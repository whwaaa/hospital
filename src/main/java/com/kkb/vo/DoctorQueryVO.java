package com.kkb.vo;

public class DoctorQueryVO {
    private Integer dId;//医生编号
    private String userName;//获取用户姓名
    private String dKeshi;//医生所在科室

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getdKeshi() {
        return dKeshi;
    }

    public void setdKeshi(String dKeshi) {
        this.dKeshi = dKeshi;
    }

}
