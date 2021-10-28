package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Chargeproject {
    private Integer chaP_id;

    private String chaP_name;

    private BigDecimal chaP_money;

    private Integer chaP_isDel;

    private Date chaP_create_time;

    private Date chaP_update_time;

    private Integer u_id;

    public Chargeproject(){
        chaP_isDel = 0;
    }

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
        this.chaP_name = chaP_name == null ? null : chaP_name.trim();
    }

    public BigDecimal getChaP_money() {
        return chaP_money;
    }

    public void setChaP_money(BigDecimal chaP_money) {
        this.chaP_money = chaP_money;
    }

    public Integer getChaP_isDel() {
        return chaP_isDel;
    }

    public void setChaP_isDel(Integer chaP_isDel) {
        this.chaP_isDel = chaP_isDel;
    }

    public Date getChaP_create_time() {
        return chaP_create_time;
    }

    public void setChaP_create_time(Date chaP_create_time) {
        this.chaP_create_time = chaP_create_time;
    }

    public Date getChaP_update_time() {
        return chaP_update_time;
    }

    public void setChaP_update_time(Date chaP_update_time) {
        this.chaP_update_time = chaP_update_time;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }
}