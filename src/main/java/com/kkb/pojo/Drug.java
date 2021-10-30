package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Drug {
    private Integer drId;

    private String drUrl;

    private BigDecimal drInprice;

    private BigDecimal drOutprice;

    private String drName;

    private String drType;

    private String drSimDesc;

    private String drExpireDate;

    private String drDetaDesc;

    private String drFatory;

    private String drDirection;

    private String drRemark;

    private Integer drNumber;

    private Integer drIsDel;

    private Date drCreateTime;

    private Date drUpdateTime;

    private Integer uId;

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    public String getDrUrl() {
        return drUrl;
    }

    public void setDrUrl(String drUrl) {
        this.drUrl = drUrl == null ? null : drUrl.trim();
    }

    public BigDecimal getDrInprice() {
        return drInprice;
    }

    public void setDrInprice(BigDecimal drInprice) {
        this.drInprice = drInprice;
    }

    public BigDecimal getDrOutprice() {
        return drOutprice;
    }

    public void setDrOutprice(BigDecimal drOutprice) {
        this.drOutprice = drOutprice;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName == null ? null : drName.trim();
    }

    public String getDrType() {
        return drType;
    }

    public void setDrType(String drType) {
        this.drType = drType == null ? null : drType.trim();
    }

    public String getDrSimDesc() {
        return drSimDesc;
    }

    public void setDrSimDesc(String drSimDesc) {
        this.drSimDesc = drSimDesc == null ? null : drSimDesc.trim();
    }

    public String getDrExpireDate() {
        return drExpireDate;
    }

    public void setDrExpireDate(String drExpireDate) {
        this.drExpireDate = drExpireDate == null ? null : drExpireDate.trim();
    }

    public String getDrDetaDesc() {
        return drDetaDesc;
    }

    public void setDrDetaDesc(String drDetaDesc) {
        this.drDetaDesc = drDetaDesc == null ? null : drDetaDesc.trim();
    }

    public String getDrFatory() {
        return drFatory;
    }

    public void setDrFatory(String drFatory) {
        this.drFatory = drFatory == null ? null : drFatory.trim();
    }

    public String getDrDirection() {
        return drDirection;
    }

    public void setDrDirection(String drDirection) {
        this.drDirection = drDirection == null ? null : drDirection.trim();
    }

    public String getDrRemark() {
        return drRemark;
    }

    public void setDrRemark(String drRemark) {
        this.drRemark = drRemark == null ? null : drRemark.trim();
    }

    public Integer getDrNumber() {
        return drNumber;
    }

    public void setDrNumber(Integer drNumber) {
        this.drNumber = drNumber;
    }

    public Integer getDrIsDel() {
        return drIsDel;
    }

    public void setDrIsDel(Integer drIsDel) {
        this.drIsDel = drIsDel;
    }

    public Date getDrCreateTime() {
        return drCreateTime;
    }

    public void setDrCreateTime(Date drCreateTime) {
        this.drCreateTime = drCreateTime;
    }

    public Date getDrUpdateTime() {
        return drUpdateTime;
    }

    public void setDrUpdateTime(Date drUpdateTime) {
        this.drUpdateTime = drUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}