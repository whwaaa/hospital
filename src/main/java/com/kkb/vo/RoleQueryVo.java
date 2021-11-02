package com.kkb.vo;

/**
 * shandong-hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/31
 */
public class RoleQueryVo {

    private String rName;

    public RoleQueryVo() {
    }

    public RoleQueryVo(String rName) {
        this.rName = rName;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }
}
