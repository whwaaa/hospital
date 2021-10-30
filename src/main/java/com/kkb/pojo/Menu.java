package com.kkb.pojo;

public class Menu {
    private Integer mId;

    private String mUrl;

    private String mName;

    private Integer mState;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl == null ? null : mUrl.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmState() {
        return mState;
    }

    public void setmState(Integer mState) {
        this.mState = mState;
    }
}