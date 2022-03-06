package com.kkb.pojo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

// 标题高度
@HeadRowHeight(18)
// 内容的行高度
@ContentRowHeight(18)
// 列宽度
@ColumnWidth(20)
public class ChargeProject implements Serializable {
    // 收费项目ID
    @ExcelProperty(value = "收费项目ID")
    private Integer chapId;

    // 收费项目
    @ExcelProperty(value = "收费项目")
    private String chapName;

    // 收费金额
    @ExcelProperty(value = "收费金额")
    private BigDecimal chapMoney;

    // 病人姓名
    @ExcelProperty(value = "病人姓名")
    private String behName;

    // 检查日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelProperty(value = "检查日期")
    private Date beChargeTime;

    @ExcelIgnore
    private Integer chapIsDel;
    @ExcelIgnore
    private BeHospital beHospital;
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chapCreateTime;
    @ExcelIgnore
    private Date chapUpdateTime;
    @ExcelIgnore
    private Integer uId;

    public String getBehName() {
        return behName;
    }

    public void setBehName(String behName) {
        this.behName = behName;
    }

    public BeHospital getBeHospital() {
        return beHospital;
    }

    public void setBeHospital(BeHospital beHospital) {
        this.beHospital = beHospital;
    }

    public Date getBeChargeTime() {
        return beChargeTime;
    }

    public void setBeChargeTime(Date beChargeTime) {
        this.beChargeTime = beChargeTime;
    }

    @Override
    public String toString() {
        return "ChargeProject{" +
                "chapId=" + chapId +
                ", chapName='" + chapName + '\'' +
                ", chapMoney=" + chapMoney +
                ", chapIsDel=" + chapIsDel +
                ", chapCreateTime=" + chapCreateTime +
                ", chapUpdateTime=" + chapUpdateTime +
                ", uId=" + uId +
                '}';
    }

    public Integer getChapId() {
        return chapId;
    }

    public void setChapId(Integer chapId) {
        this.chapId = chapId;
    }

    public String getChapName() {
        return chapName;
    }

    public void setChapName(String chapName) {
        this.chapName = chapName == null ? null : chapName.trim();
    }

    public BigDecimal getChapMoney() {
        return chapMoney;
    }

    public void setChapMoney(BigDecimal chapMoney) {
        this.chapMoney = chapMoney;
    }

    public Integer getChapIsDel() {
        return chapIsDel;
    }

    public void setChapIsDel(Integer chapIsDel) {
        this.chapIsDel = chapIsDel;
    }

    public Date getChapCreateTime() {
        return chapCreateTime;
    }

    public void setChapCreateTime(Date chapCreateTime) {
        this.chapCreateTime = chapCreateTime;
    }

    public Date getChapUpdateTime() {
        return chapUpdateTime;
    }

    public void setChapUpdateTime(Date chapUpdateTime) {
        this.chapUpdateTime = chapUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

}