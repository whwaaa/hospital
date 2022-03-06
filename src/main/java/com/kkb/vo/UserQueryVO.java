package com.kkb.vo;

/**
 * Shandong_Hospital
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 *
 */
public class UserQueryVO {

    private String uLoginName;

    public UserQueryVO(String uLoginName) {
        this.uLoginName = uLoginName;
    }

    public UserQueryVO() {
    }

    public String getuLoginName() {
        return uLoginName;
    }

    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName;
    }
}
