package com.kkb.pojo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

// 标题高度
@HeadRowHeight(18)
// 内容的行高度
@ContentRowHeight(18)
// 列宽度
@ColumnWidth(20)
public class Doctor implements Serializable {
    // 身份证号
    @ExcelProperty(value = "身份证号")
    private String doctorIdCar;
    @ExcelIgnore
    private String dIdCar;

    // 医生编号
    @ExcelIgnore
    private Integer dId;

    // 手机号
    @ExcelProperty(value = "手机号")
    private String doctorPhone;
    @ExcelIgnore
    private String dPhone;

    // 座机号
    @ExcelProperty(value = "座机号")
    private String doctorTelphone;
    @ExcelIgnore
    private String dTelphone;

    // 性别：0男 1 女
    @ExcelIgnore
    private Integer dSex;
    @ExcelProperty(value = "性别")
    private String strDSex;

    // 出生日期
    /* pattern：日期格式  timezone：时区 */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ExcelProperty(value = "出生日期")
    private Date doctorBirthday;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ExcelIgnore
    private Date dBirthday;

    // 年龄
    @ExcelProperty(value = "年龄")
    private Integer doctorAge;
    @ExcelIgnore
    private Integer dAge;

    // 电子邮箱
    @ExcelProperty(value = "电子邮箱")
    private String doctorEmail;
    @ExcelIgnore
    private String dEmail;

    // 所属科室
    @ExcelProperty(value = "所属科室")
    private String doctorKeshi;
    @ExcelIgnore
    private String dKeshi;

    // 学历
    @ExcelProperty(value = "学历")
    private String doctorXueli;
    @ExcelIgnore
    private String dXueli;

    // 备注
    @ExcelProperty(value = "备注")
    private String doctorDesc;
    @ExcelIgnore
    private String dDesc;

    // 医生姓名, 返回参数需要
    @ExcelProperty(value = "医生姓名")
    private String doctorName;

    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dIntime;
    @ExcelIgnore
    private Integer dState;
    @ExcelIgnore
    private Integer dIsDel;
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dCreateTime;
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dUpdateTime;
    @ExcelIgnore
    private Integer uId;
    @ExcelIgnore
    private User user;

    public String getDoctorIdCar() {
        return doctorIdCar;
    }

    public void setDoctorIdCar(String doctorIdCar) {
        this.doctorIdCar = doctorIdCar;
    }

    public String getdIdCar() {
        return dIdCar;
    }

    public void setdIdCar(String dIdCar) {
        this.dIdCar = dIdCar;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getdPhone() {
        return dPhone;
    }

    public void setdPhone(String dPhone) {
        this.dPhone = dPhone;
    }

    public String getDoctorTelphone() {
        return doctorTelphone;
    }

    public void setDoctorTelphone(String doctorTelphone) {
        this.doctorTelphone = doctorTelphone;
    }

    public String getdTelphone() {
        return dTelphone;
    }

    public void setdTelphone(String dTelphone) {
        this.dTelphone = dTelphone;
    }

    public Integer getdSex() {
        return dSex;
    }

    public void setdSex(Integer dSex) {
        this.dSex = dSex;
    }

    public String getStrDSex() {
        return strDSex;
    }

    public void setStrDSex(String strDSex) {
        this.strDSex = strDSex;
    }

    public Date getDoctorBirthday() {
        return doctorBirthday;
    }

    public void setDoctorBirthday(Date doctorBirthday) {
        this.doctorBirthday = doctorBirthday;
    }

    public Date getdBirthday() {
        return dBirthday;
    }

    public void setdBirthday(Date dBirthday) {
        this.dBirthday = dBirthday;
    }

    public Integer getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(Integer doctorAge) {
        this.doctorAge = doctorAge;
    }

    public Integer getdAge() {
        return dAge;
    }

    public void setdAge(Integer dAge) {
        this.dAge = dAge;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail;
    }

    public String getDoctorKeshi() {
        return doctorKeshi;
    }

    public void setDoctorKeshi(String doctorKeshi) {
        this.doctorKeshi = doctorKeshi;
    }

    public String getdKeshi() {
        return dKeshi;
    }

    public void setdKeshi(String dKeshi) {
        this.dKeshi = dKeshi;
    }

    public String getDoctorXueli() {
        return doctorXueli;
    }

    public void setDoctorXueli(String doctorXueli) {
        this.doctorXueli = doctorXueli;
    }

    public String getdXueli() {
        return dXueli;
    }

    public void setdXueli(String dXueli) {
        this.dXueli = dXueli;
    }

    public String getDoctorDesc() {
        return doctorDesc;
    }

    public void setDoctorDesc(String doctorDesc) {
        this.doctorDesc = doctorDesc;
    }

    public String getdDesc() {
        return dDesc;
    }

    public void setdDesc(String dDesc) {
        this.dDesc = dDesc;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getdIntime() {
        return dIntime;
    }

    public void setdIntime(Date dIntime) {
        this.dIntime = dIntime;
    }

    public Integer getdState() {
        return dState;
    }

    public void setdState(Integer dState) {
        this.dState = dState;
    }

    public Integer getdIsDel() {
        return dIsDel;
    }

    public void setdIsDel(Integer dIsDel) {
        this.dIsDel = dIsDel;
    }

    public Date getdCreateTime() {
        return dCreateTime;
    }

    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    public Date getdUpdateTime() {
        return dUpdateTime;
    }

    public void setdUpdateTime(Date dUpdateTime) {
        this.dUpdateTime = dUpdateTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}