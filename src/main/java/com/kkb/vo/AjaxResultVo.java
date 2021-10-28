package com.kkb.vo;

/**
 * api
 *
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/12
 */
public class AjaxResultVo<T> {
    private Integer code;
    private String msg;
    private Object data;

    public AjaxResultVo(Object data) {
        this.code = 200;
        this.msg = "ok";
        this.data = data;
    }

    public AjaxResultVo() {
        this.code = 200;
        this.msg = "ok";
    }

    public AjaxResultVo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
