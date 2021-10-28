package com.kkb.pojo;

import java.util.Date;

public class Role {
    private Integer r_id;

    private String r_name;

    private Integer r_state;

    private Integer r_isDel;

    private Date r_create_time;

    private Date _update_time;

    private Integer u_id;

    public Role(){
        r_isDel = 0;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name == null ? null : r_name.trim();
    }

    public Integer getR_state() {
        return r_state;
    }

    public void setR_state(Integer r_state) {
        this.r_state = r_state;
    }

    public Integer getR_isDel() {
        return r_isDel;
    }

    public void setR_isDel(Integer r_isDel) {
        this.r_isDel = r_isDel;
    }

    public Date getR_create_time() {
        return r_create_time;
    }

    public void setR_create_time(Date r_create_time) {
        this.r_create_time = r_create_time;
    }

    public Date get_update_time() {
        return _update_time;
    }

    public void set_update_time(Date _update_time) {
        this._update_time = _update_time;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }
}