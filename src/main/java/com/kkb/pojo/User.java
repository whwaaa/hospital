package com.kkb.pojo;

import java.util.Date;

public class User {
    private Integer u_id;

    private String u_loginName;

    private String u_passWord;

    private String u_trueName;

    private String u_email;

    private Integer u_state;

    private Integer r_id;

    private Integer u_isDel;

    private Date u_create_time;

    private Date u_update_time;

    public User(){
        u_isDel = 0;
    }
    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_loginName() {
        return u_loginName;
    }

    public void setU_loginName(String u_loginName) {
        this.u_loginName = u_loginName == null ? null : u_loginName.trim();
    }

    public String getU_passWord() {
        return u_passWord;
    }

    public void setU_passWord(String u_passWord) {
        this.u_passWord = u_passWord == null ? null : u_passWord.trim();
    }

    public String getU_trueName() {
        return u_trueName;
    }

    public void setU_trueName(String u_trueName) {
        this.u_trueName = u_trueName == null ? null : u_trueName.trim();
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email == null ? null : u_email.trim();
    }

    public Integer getU_state() {
        return u_state;
    }

    public void setU_state(Integer u_state) {
        this.u_state = u_state;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Integer getU_isDel() {
        return u_isDel;
    }

    public void setU_isDel(Integer u_isDel) {
        this.u_isDel = u_isDel;
    }

    public Date getU_create_time() {
        return u_create_time;
    }

    public void setU_create_time(Date u_create_time) {
        this.u_create_time = u_create_time;
    }

    public Date getU_update_time() {
        return u_update_time;
    }

    public void setU_update_time(Date u_update_time) {
        this.u_update_time = u_update_time;
    }
}