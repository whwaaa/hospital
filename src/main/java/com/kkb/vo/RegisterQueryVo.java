package com.kkb.vo;

import java.util.Date;
import java.util.List;

/**
 * 挂表查询多条实体
 * @author wuhanwei
 * @version 1.0
 * @date 2021/11/12
 */
public class RegisterQueryVo {

    // 病例号
    private String hosrId;
    // 医生姓名
    private String doctorName;
    // 医生科室
    private String dKeshi;
    // 挂号开始时间(模糊时间)
    private String createTimeStartBlur;
    // 挂号结束时间(模糊时间)
    private String createTimeEndBlur;
    // 挂号开始时间
    private Date createTimeStart;
    // 挂号结束时间
    private Date createTimeEnd;
    // 根据医生名字,医生所属科室查,询到的医生id集合
    List<Integer> doctorId;

    public String getHosrId() {
        return hosrId;
    }

    public void setHosrId(String hosrId) {
        this.hosrId = hosrId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getdKeshi() {
        return dKeshi;
    }

    public void setdKeshi(String dKeshi) {
        this.dKeshi = dKeshi;
    }

    public String getCreateTimeStartBlur() {
        return createTimeStartBlur;
    }

    public void setCreateTimeStartBlur(String createTimeStartBlur) {
        this.createTimeStartBlur = createTimeStartBlur;
    }

    public String getCreateTimeEndBlur() {
        return createTimeEndBlur;
    }

    public void setCreateTimeEndBlur(String createTimeEndBlur) {
        this.createTimeEndBlur = createTimeEndBlur;
    }

    public Date getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Date createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public List<Integer> getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(List<Integer> doctorId) {
        this.doctorId = doctorId;
    }
}
