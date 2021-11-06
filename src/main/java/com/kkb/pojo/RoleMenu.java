package com.kkb.pojo;

import java.io.Serializable;

public class RoleMenu implements Serializable {
    private Integer rmId;

    private Integer rId;

    private Integer mId;

    public Integer getRmId() {
        return rmId;
    }

    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }
}