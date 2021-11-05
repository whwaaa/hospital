package com.kkb.pojo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 药瓶实体类
 */
public class Drug {
    /**
     * 药品的编号，1位英文编+7位数字
     * Z 中药
     * X 西药
     * C 处方
     * F 非处方
     */
    @NotBlank(message = "药品编码不能为空")
    @Pattern(regexp = "^([ZXCF])([0-9]{7})$",message = "药品编码不正确，不符合1位英文编(ZXCF)+7位数字(0-9)")
    private String drId;
    // 药品图片URL，根据文件是否为空判定
    @NotBlank(message = "药品图片不能为空")
    private String drUrl;
    // 进价（元）
    @NotNull
    @DecimalMin("0")
    private BigDecimal drInprice;
    // 售价（元）
    @NotNull
    @DecimalMin("0")
    private BigDecimal drOutprice;
    // 药品名称
    @NotBlank(message = "药品名称不能为空")
    @Length(min = 3,max = 50,message = "药品名称字数需为3-50")
    private String drName;
    // 药品类型
    @NotBlank(message = "药品类型不能为空")
    private String drType;
    // 简单介绍
    private String drSimDesc;
    // 保质期,单位月
    @Range(min = 1,max = 50,message = "保质期范围为1-50个月")
    private Integer drExpireDate;
    // 详细描述
    @NotBlank(message = "详细描述不能为空")
    @Length(min = 10,max = 200,message = "详细描述字数需为10-200")
    private String drDetaDesc;
    // 生产厂家
    @NotBlank(message = "生产厂家不能为空")
    @Length(min = 3,max = 50,message = "生产厂家的个数需为3-50")
    private String drFatory;
    // 服用说明
    @NotBlank(message = "服用说明不能为空")
    @Length(min = 10,max = 200,message = "服用说明的个数需为10-200")
    private String drDirection;
    // 备注
    private String drRemark;
    // 药品的库存
    private Integer drNumber;
    // 是否删除，0表示未删除，1表示已删除
    private Integer drIsDel;
    // 创建时间
    @Null
    private Date drCreateTime;
    // 更新时间
    @Null
    private Date drUpdateTime;
    // 上一次操作的人
    @Null
    private Integer uId;

    public String getDrId() {
        return drId;
    }

    public void setDrId(String drId) {
        this.drId = drId == null ? null : drId.trim();
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

    public Integer getDrExpireDate() {
        return drExpireDate;
    }

    public void setDrExpireDate(Integer drExpireDate) {
        this.drExpireDate = drExpireDate;
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