package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class HosRegister {
    private Integer hosrId;

    private String hosrName;

    private String hosrIdcar;

    private String hosrMedical;

    private BigDecimal hosrRegPrice;

    private String hosrPhone;

    private Integer hosrSelfPrice;

    private Integer hosrSex;

    private Integer hosrAge;

    private String hosrWork;

    private String hosrLookDoctor;

    private Integer dId;

    private String hosrRemark;

    private Integer hosrState;

    private Integer hosrIsDel;

    private Date hosrCreateTime;

    private Date hosrUpdateTime;

    private Integer uId;

    public Integer getHosrId() {
        return hosrId;
    }

    public void setHosrId(Integer hosrId) {
        this.hosrId = hosrId;
    }

    public String getHosrName() {
        return hosrName;
    }

    public void setHosrName(String hosrName) {
        this.hosrName = hosrName == null ? null : hosrName.trim();
    }

    public String getHosrIdcar() {
        return hosrIdcar;
    }

    public void setHosrIdcar(String hosrIdcar) {
        this.hosrIdcar = hosrIdcar == null ? null : hosrIdcar.trim();
    }

    public String getHosrMedical() {
        return hosrMedical;
    }

    public void setHosrMedical(String hosrMedical) {
        this.hosrMedical = hosrMedical == null ? null : hosrMedical.trim();
    }

    public BigDecimal getHosrRegPrice() {
        return hosrRegPrice;
    }

    public void setHosrRegPrice(BigDecimal hosrRegPrice) {
        this.hosrRegPrice = hosrRegPrice;
    }

    public String getHosrPhone() {
        return hosrPhone;
    }

    public void setHosrPhone(String hosrPhone) {
        this.hosrPhone = hosrPhone == null ? null : hosrPhone.trim();
    }

    public Integer getHosrSelfPrice() {
        return hosrSelfPrice;
    }

    public void setHosrSelfPrice(Integer hosrSelfPrice) {
        this.hosrSelfPrice = hosrSelfPrice;
    }

    public Integer getHosrSex() {
        return hosrSex;
    }

    public void setHosrSex(Integer hosrSex) {
        this.hosrSex = hosrSex;
    }

    public Integer getHosrAge() {
        return hosrAge;
    }

    public void setHosrAge(Integer hosrAge) {
        this.hosrAge = hosrAge;
    }

    public String getHosrWork() {
        return hosrWork;
    }

    public void setHosrWork(String hosrWork) {
        this.hosrWork = hosrWork == null ? null : hosrWork.trim();
    }

    public String getHosrLookDoctor() {
        return hosrLookDoctor;
    }

    public void setHosrLookDoctor(String hosrLookDoctor) {
        this.hosrLookDoctor = hosrLookDoctor == null ? null : hosrLookDoctor.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getHosrRemark() {
        return hosrRemark;
    }

    public void setHosrRemark(String hosrRemark) {
        this.hosrRemark = hosrRemark == null ? null : hosrRemark.trim();
    }

    public Integer getHosrState() {
        return hosrState;
    }

    public void setHosrState(Integer hosrState) {
        this.hosrState = hosrState;
    }

    public Integer getHosrIsDel() {
        return hosrIsDel;
    }

    public void setHosrIsDel(Integer hosrIsDel) {
        this.hosrIsDel = hosrIsDel;
    }

    public Date getHosrCreateTime() {
        return hosrCreateTime;
    }

    public void setHosrCreateTime(Date hosrCreateTime) {
        this.hosrCreateTime = hosrCreateTime;
    }

    public Date getHosrUpdateTime() {
        return hosrUpdateTime;
    }

    public void setHosrUpdateTime(Date hosrUpdateTime) {
        this.hosrUpdateTime = hosrUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}