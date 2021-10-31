package com.kkb.pojo;

import java.util.Date;

public class Role {
    private Integer rId;

    private String rName;

    private Integer rState;

    private Integer rIsDel;

    private Date rCreateTime;

    private Date rUpdateTime;

    private Integer uId;

    private String menuIds;

    public String getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    public Integer getrIsDel() {
        return rIsDel;
    }

    public void setrIsDel(Integer rIsDel) {
        this.rIsDel = rIsDel;
    }

    public Date getrCreateTime() {
        return rCreateTime;
    }

    public void setrCreateTime(Date rCreateTime) {
        this.rCreateTime = rCreateTime;
    }

    public Date getrUpdateTime() {
        return rUpdateTime;
    }

    public void setrUpdateTime(Date rUpdateTime) {
        this.rUpdateTime = rUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}