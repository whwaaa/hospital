package com.kkb.pojo;

import java.util.Date;

public class Doctor {
    private Integer d_id;

    private String d_idCar;

    private String d_phone;

    private String d_telPhone;

    private Integer d_sex;

    private Date d_birthday;

    private Integer d_age;

    private String d_email;

    private String d_keshi;

    private String d_xueli;

    private String d_desc;

    private Date d_inTime;

    private Integer d_state;

    private Integer d_isDel;

    private Date d_create_time;

    private Date d_update_time;

    private Integer u_id;

    public Doctor(){
        d_isDel = 0;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_idCar() {
        return d_idCar;
    }

    public void setD_idCar(String d_idCar) {
        this.d_idCar = d_idCar == null ? null : d_idCar.trim();
    }

    public String getD_phone() {
        return d_phone;
    }

    public void setD_phone(String d_phone) {
        this.d_phone = d_phone == null ? null : d_phone.trim();
    }

    public String getD_telPhone() {
        return d_telPhone;
    }

    public void setD_telPhone(String d_telPhone) {
        this.d_telPhone = d_telPhone == null ? null : d_telPhone.trim();
    }

    public Integer getD_sex() {
        return d_sex;
    }

    public void setD_sex(Integer d_sex) {
        this.d_sex = d_sex;
    }

    public Date getD_birthday() {
        return d_birthday;
    }

    public void setD_birthday(Date d_birthday) {
        this.d_birthday = d_birthday;
    }

    public Integer getD_age() {
        return d_age;
    }

    public void setD_age(Integer d_age) {
        this.d_age = d_age;
    }

    public String getD_email() {
        return d_email;
    }

    public void setD_email(String d_email) {
        this.d_email = d_email == null ? null : d_email.trim();
    }

    public String getD_keshi() {
        return d_keshi;
    }

    public void setD_keshi(String d_keshi) {
        this.d_keshi = d_keshi == null ? null : d_keshi.trim();
    }

    public String getD_xueli() {
        return d_xueli;
    }

    public void setD_xueli(String d_xueli) {
        this.d_xueli = d_xueli == null ? null : d_xueli.trim();
    }

    public String getD_desc() {
        return d_desc;
    }

    public void setD_desc(String d_desc) {
        this.d_desc = d_desc == null ? null : d_desc.trim();
    }

    public Date getD_inTime() {
        return d_inTime;
    }

    public void setD_inTime(Date d_inTime) {
        this.d_inTime = d_inTime;
    }

    public Integer getD_state() {
        return d_state;
    }

    public void setD_state(Integer d_state) {
        this.d_state = d_state;
    }

    public Integer getD_isDel() {
        return d_isDel;
    }

    public void setD_isDel(Integer d_isDel) {
        this.d_isDel = d_isDel;
    }

    public Date getD_create_time() {
        return d_create_time;
    }

    public void setD_create_time(Date d_create_time) {
        this.d_create_time = d_create_time;
    }

    public Date getD_update_time() {
        return d_update_time;
    }

    public void setD_update_time(Date d_update_time) {
        this.d_update_time = d_update_time;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }
}