package com.kkb.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author:XiaoFei
 * @version:1.0
 * @Date:2021/10/28/17:54
 */
public class ChargeQueryVo {
    private Integer chaP_id;
    private String chaP_name;
    private double chaP_money;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chaP_create_time;
    private String coach;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chaP_update_time;
    private Integer chaP_isDel;
    private Integer u_id;

    public Integer getChaP_id() {
        return chaP_id;
    }

    public void setChaP_id(Integer chaP_id) {
        this.chaP_id = chaP_id;
    }

    public String getChaP_name() {
        return chaP_name;
    }

    public void setChaP_name(String chaP_name) {
        this.chaP_name = chaP_name;
    }

    public double getChaP_money() {
        return chaP_money;
    }

    public void setChaP_money(double chaP_money) {
        this.chaP_money = chaP_money;
    }

    public Date getChaP_create_time() {
        return chaP_create_time;
    }

    public void setChaP_create_time(Date chaP_create_time) {
        this.chaP_create_time = chaP_create_time;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Date getChaP_update_time() {
        return chaP_update_time;
    }

    public void setChaP_update_time(Date chaP_update_time) {
        this.chaP_update_time = chaP_update_time;
    }

    public Integer getChaP_isDel() {
        return chaP_isDel;
    }

    public void setChaP_isDel(Integer chaP_isDel) {
        this.chaP_isDel = chaP_isDel;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    @Override
    public String toString() {
        return "QueryCharge{" +
                "chaP_id=" + chaP_id +
                ", chaP_name='" + chaP_name + '\'' +
                ", chaP_money=" + chaP_money +
                ", chaP_create_time=" + chaP_create_time +
                ", coach='" + coach + '\'' +
                ", chaP_update_time=" + chaP_update_time +
                ", chaP_isDel=" + chaP_isDel +
                ", u_id=" + u_id +
                '}';
    }
}
