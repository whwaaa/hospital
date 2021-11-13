package com.kkb.pojo;

import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HosRegister implements Serializable {

    // 病历号
    private Integer hosrId;

    // 病人姓名
    @NotBlank(message = "病人姓名不能为空")
    private String hosrName;

    // 病人身份证号
    @NotBlank(message = "身份证不能为空")
    @Pattern(regexp = "/^(\\d{18,18}|\\d{15,15}|\\d{17,17}X)$/", message = "身份证不合法")
    private String hosrIdcar;

    // 病人社保号
    @NotBlank(message = "社保号不能为空")
    @Pattern(regexp = "/^(\\d{18,18}|\\d{15,15}|\\d{17,17}X)$/", message = "社保号不合法")
    private String hosrMedical;

    // 挂号费
    @NotNull
    @DecimalMin("0")
    private BigDecimal hosrRegPrice;

    // 手机号
    @Length(min = 8,max = 11,message = "手机号位数不对")
    @Pattern(regexp = "/^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$/", message = "手机号不正确")
    private String hosrPhone;

    // 是否自费
    @NotNull
    @Size(max = 1)
    private Integer hosrSelfPrice;

    // 性别 0:男 1:女
    @NotNull
    @Size(max = 1)
    private Integer hosrSex;

    // 病人年龄
    @NotNull
    @DecimalMin("0")
    private Integer hosrAge;

    // 病人职业
    @NotBlank(message = "病人职业不能为空")
    private String hosrWork;

    // 初复诊 0:初诊 1:复诊
    @Size(max = 1)
    private String hosrLookDoctor;

    // 医生id
    @NotNull
    private Integer dId;

    // 备注
    @NotBlank(message = "备注不能为空")
    private String hosrRemark;

    // 挂号状态：0挂号 1已住院 2已出院 3已退号
    @Size(max = 3)
    private Integer hosrState;

    // 是否删除 0:不删除 1:删除
    @Size(max = 1)
    private Integer hosrIsDel;

    // 创建时间
    private Date hosrCreateTime;

    // 更新时间
    private Date hosrUpdateTime;

    // 最后操作数据的用户id
    private Integer uId;

    // 创建时间 (返给前端)
    private String hosrCreateTimeStr;
    // 医生姓名 (返回前端的数据)
    private String doctorName;
    // 挂号科室 (返回前端的数据)
    private String keshi;

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

    public String getHosrCreateTimeStr() {
        return hosrCreateTimeStr;
    }

    public void setHosrCreateTimeStr(String hosrCreateTimeStr) {
        this.hosrCreateTimeStr = hosrCreateTimeStr;
    }

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