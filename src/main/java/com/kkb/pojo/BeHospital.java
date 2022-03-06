package com.kkb.pojo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

// 标题高度
@HeadRowHeight(18)
// 内容的行高度
@ContentRowHeight(18)
// 列宽度
@ColumnWidth(20)
public class BeHospital implements Serializable {

    // 设置列的宽度
    @ColumnWidth(10)
    // 住院人姓名
    @NotBlank(message = "住院人姓名不能为空")
    @ExcelProperty(value = "姓名")
    private String behName;
    // 社保号
    @ExcelProperty(value = "社保号")
    private String hosrMedical;
    // 联系电话
    @ExcelProperty(value = "联系电话")
    private String hosrPhone;
    // 是否自费
    @ExcelProperty(value = "是否自费")
    private String hosrSelfPrice;
    // 性别
    @ExcelProperty(value = "性别")
    private String hosrSex;
    // 年龄
    @ExcelProperty(value = "年龄")
    private Integer hosrAge;
    // 职业
    @ExcelProperty(value = "职业")
    private String hosrWork;
    // 初复诊
    @ExcelProperty(value = "初复诊")
    private String hosrLookDoctor;
    // 所挂科室
    @ExcelProperty(value = "所挂科室")
    private String keshi;
    // 指定医生
    @ExcelProperty(value = "指定医生")
    private String doctorName;
    // 押金金额
    @ExcelProperty(value = "押金金额")
    private String behAntecedentStr;
    // 病情介绍
    @NotBlank(message = "病情介绍不能为空")
    @ExcelProperty(value = "备注")
    private String behIllness;

    // 主键id
    @ExcelIgnore
    private Integer behId;
    // 护理人
    @NotBlank(message = "护理人不能为空")
    @ExcelIgnore
    private String behNursePeople;
    // 病床号
    @NotBlank(message = "病床号不能为空")
    @ExcelIgnore
    private String behPatBed;
    // 缴纳金额
    @NotBlank(message = "缴纳金额不能为空")
    @ExcelIgnore
    private BigDecimal behAntecedent;
    // 结算状态：0未结算 1已结算
    @NotNull
    @Size(max = 1)
    @ExcelIgnore
    private Integer behClosePrice;
    // 信息状态:  暂不用
    @ExcelIgnore
    private Integer behState;
    @ExcelIgnore
    private Integer behIsDel;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelIgnore
    private Date behCreateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ExcelIgnore
    private Date behUpdateTime;
    @ExcelIgnore
    private Integer uId;
    @ExcelIgnore
    private BigDecimal allCast;
    @ExcelIgnore
    private BigDecimal blank;

    @Override
    public String toString() {
        return "BeHospital{" +
                "behName='" + behName + '\'' +
                ", hosrMedical='" + hosrMedical + '\'' +
                ", hosrPhone='" + hosrPhone + '\'' +
                ", hosrSelfPrice='" + hosrSelfPrice + '\'' +
                ", hosrSex='" + hosrSex + '\'' +
                ", hosrAge=" + hosrAge +
                ", hosrWork='" + hosrWork + '\'' +
                ", hosrLookDoctor='" + hosrLookDoctor + '\'' +
                ", keshi='" + keshi + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", behAntecedentStr=" + behAntecedentStr +
                ", behIllness='" + behIllness + '\'' +
                ", behId=" + behId +
                ", behNursePeople='" + behNursePeople + '\'' +
                ", behPatBed='" + behPatBed + '\'' +
                ", behAntecedent=" + behAntecedent +
                ", behClosePrice=" + behClosePrice +
                ", behState=" + behState +
                ", behIsDel=" + behIsDel +
                ", behCreateTime=" + behCreateTime +
                ", behUpdateTime=" + behUpdateTime +
                ", uId=" + uId +
                ", allCast=" + allCast +
                ", blank=" + blank +
                '}';
    }

    public String getHosrMedical() {
        return hosrMedical;
    }

    public void setHosrMedical(String hosrMedical) {
        this.hosrMedical = hosrMedical;
    }

    public String getHosrPhone() {
        return hosrPhone;
    }

    public void setHosrPhone(String hosrPhone) {
        this.hosrPhone = hosrPhone;
    }

    public String getHosrSelfPrice() {
        return hosrSelfPrice;
    }

    public void setHosrSelfPrice(String hosrSelfPrice) {
        this.hosrSelfPrice = hosrSelfPrice;
    }

    public String getHosrSex() {
        return hosrSex;
    }

    public void setHosrSex(String hosrSex) {
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
        this.hosrWork = hosrWork;
    }

    public String getHosrLookDoctor() {
        return hosrLookDoctor;
    }

    public void setHosrLookDoctor(String hosrLookDoctor) {
        this.hosrLookDoctor = hosrLookDoctor;
    }

    public String getKeshi() {
        return keshi;
    }

    public void setKeshi(String keshi) {
        this.keshi = keshi;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getBehAntecedentStr() {
        return behAntecedentStr;
    }

    public void setBehAntecedentStr(String behAntecedentStr) {
        this.behAntecedentStr = behAntecedentStr;
    }

    public BigDecimal getBlank() {
        return blank;
    }

    public void setBlank(BigDecimal blank) {
        this.blank = blank;
    }

    public BigDecimal getAllCast() {
        return allCast;
    }

    public void setAllCast(BigDecimal allCast) {
        this.allCast = allCast;
    }

    public Integer getBehId() {
        return behId;
    }

    public void setBehId(Integer behId) {
        this.behId = behId;
    }

    public String getBehName() {
        return behName;
    }

    public void setBehName(String behName) {
        this.behName = behName == null ? null : behName.trim();
    }

    public String getBehNursePeople() {
        return behNursePeople;
    }

    public void setBehNursePeople(String behNursePeople) {
        this.behNursePeople = behNursePeople == null ? null : behNursePeople.trim();
    }

    public String getBehPatBed() {
        return behPatBed;
    }

    public void setBehPatBed(String behPatBed) {
        this.behPatBed = behPatBed == null ? null : behPatBed.trim();
    }

    public BigDecimal getBehAntecedent() {
        return behAntecedent;
    }

    public void setBehAntecedent(BigDecimal behAntecedent) {
        this.behAntecedent = behAntecedent;
    }

    public String getBehIllness() {
        return behIllness;
    }

    public void setBehIllness(String behIllness) {
        this.behIllness = behIllness == null ? null : behIllness.trim();
    }

    public Integer getBehClosePrice() {
        return behClosePrice;
    }

    public void setBehClosePrice(Integer behClosePrice) {
        this.behClosePrice = behClosePrice;
    }

    public Integer getBehState() {
        return behState;
    }

    public void setBehState(Integer behState) {
        this.behState = behState;
    }

    public Integer getBehIsDel() {
        return behIsDel;
    }

    public void setBehIsDel(Integer behIsDel) {
        this.behIsDel = behIsDel;
    }

    public Date getBehCreateTime() {
        return behCreateTime;
    }

    public void setBehCreateTime(Date behCreateTime) {
        this.behCreateTime = behCreateTime;
    }

    public Date getBehUpdateTime() {
        return behUpdateTime;
    }

    public void setBehUpdateTime(Date behUpdateTime) {
        this.behUpdateTime = behUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}