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

    // 门诊号
    private String hosrId;
    // 病人姓名
    private String hosrName;
    // 医生姓名
    private String doctorName;
    // 医生科室
    private String dKeshi;
    // 挂号或住院开始时间(模糊时间)
    private String createTimeStartBlur;
    // 挂号或住院结束时间(模糊时间)
    private String createTimeEndBlur;
    // 挂号或住院开始时间
    private Date createTimeStart;
    // 挂号或住院结束时间
    private Date createTimeEnd;
    // 根据医生名字,医生所属科室查,询到的医生id集合
    List<Integer> doctorId;
    // 关联住院表的挂号表id集合
    private List<Integer> hosrIdList;

    public List<Integer> getHosrIdList() {
        return hosrIdList;
    }

    public void setHosrIdList(List<Integer> hosrIdList) {
        this.hosrIdList = hosrIdList;
    }

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

    public String getHosrName() {
        return hosrName;
    }

    public void setHosrName(String hosrName) {
        this.hosrName = hosrName;
    }
}
