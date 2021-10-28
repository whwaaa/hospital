package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Drug {
    private Integer dr_id;

    private String dr_url;

    private BigDecimal dr_inPrice;

    private BigDecimal dr_outPrice;

    private String dr_name;

    private String dr_type;

    private String dr_simDesc;

    private String dr_expire_date;

    private String dr_detaDesc;

    private String dr_fatory;

    private String dr_direction;

    private String dr_remark;

    private Integer dr_number;

    private Integer dr_isDel;

    private Date dr_create_time;

    private Date dr_update_time;

    private Integer u_id;

    public Drug(){
        dr_isDel = 0;
    }

    public Integer getDr_id() {
        return dr_id;
    }

    public void setDr_id(Integer dr_id) {
        this.dr_id = dr_id;
    }

    public String getDr_url() {
        return dr_url;
    }

    public void setDr_url(String dr_url) {
        this.dr_url = dr_url == null ? null : dr_url.trim();
    }

    public BigDecimal getDr_inPrice() {
        return dr_inPrice;
    }

    public void setDr_inPrice(BigDecimal dr_inPrice) {
        this.dr_inPrice = dr_inPrice;
    }

    public BigDecimal getDr_outPrice() {
        return dr_outPrice;
    }

    public void setDr_outPrice(BigDecimal dr_outPrice) {
        this.dr_outPrice = dr_outPrice;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name == null ? null : dr_name.trim();
    }

    public String getDr_type() {
        return dr_type;
    }

    public void setDr_type(String dr_type) {
        this.dr_type = dr_type == null ? null : dr_type.trim();
    }

    public String getDr_simDesc() {
        return dr_simDesc;
    }

    public void setDr_simDesc(String dr_simDesc) {
        this.dr_simDesc = dr_simDesc == null ? null : dr_simDesc.trim();
    }

    public String getDr_expire_date() {
        return dr_expire_date;
    }

    public void setDr_expire_date(String dr_expire_date) {
        this.dr_expire_date = dr_expire_date == null ? null : dr_expire_date.trim();
    }

    public String getDr_detaDesc() {
        return dr_detaDesc;
    }

    public void setDr_detaDesc(String dr_detaDesc) {
        this.dr_detaDesc = dr_detaDesc == null ? null : dr_detaDesc.trim();
    }

    public String getDr_fatory() {
        return dr_fatory;
    }

    public void setDr_fatory(String dr_fatory) {
        this.dr_fatory = dr_fatory == null ? null : dr_fatory.trim();
    }

    public String getDr_direction() {
        return dr_direction;
    }

    public void setDr_direction(String dr_direction) {
        this.dr_direction = dr_direction == null ? null : dr_direction.trim();
    }

    public String getDr_remark() {
        return dr_remark;
    }

    public void setDr_remark(String dr_remark) {
        this.dr_remark = dr_remark == null ? null : dr_remark.trim();
    }

    public Integer getDr_number() {
        return dr_number;
    }

    public void setDr_number(Integer dr_number) {
        this.dr_number = dr_number;
    }

    public Integer getDr_isDel() {
        return dr_isDel;
    }

    public void setDr_isDel(Integer dr_isDel) {
        this.dr_isDel = dr_isDel;
    }

    public Date getDr_create_time() {
        return dr_create_time;
    }

    public void setDr_create_time(Date dr_create_time) {
        this.dr_create_time = dr_create_time;
    }

    public Date getDr_update_time() {
        return dr_update_time;
    }

    public void setDr_update_time(Date dr_update_time) {
        this.dr_update_time = dr_update_time;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }
}