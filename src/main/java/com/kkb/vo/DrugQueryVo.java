package com.kkb.vo;
/**
 * show 药品查询条件类
 *
 * @author guguofu
 * @since 2021/10/31
 */
public class DrugQueryVo {
    // 药品名称
    private String drName;
    // 药品类型
    private String drType;

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getDrType() {
        return drType;
    }

    public void setDrType(String drType) {
        this.drType = drType;
    }
}
