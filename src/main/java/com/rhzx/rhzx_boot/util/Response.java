package com.rhzx.rhzx_boot.util;

import java.io.Serializable;

/**
 * Created by chenliusong on 2016/11/17.
 */
public class Response implements Serializable{


    private static final int OK = 200;
    private static final int REDIRECT = 302;
    private static final int ERROR_400 = 400;
    private static final int ERROR_401 = 401;
    private static final int ERROR_500 = 500;
    private static final long serialVersionUID = 1978739423933610705L;

    private Object data;
    private Integer code;
    private String msg;

    public Response success() {
        this.code = OK;
        this.msg = "success";
        return this;
    }

    public Response success(Object data) {
        this.code = OK;
        this.msg = "success";
        this.data = data;
        return this;
    }

    public Response redirect(String message,Object data) {
        this.code = REDIRECT;
        this.msg = message;
        this.data = data;
        return this;
    }

    /**
     * request error
     * @param message
     * @return
     */
    public Response failure400(String message) {
        this.code = ERROR_400;
        this.msg = message;
        return this;
    }

    /**
     * request error
     * @param message
     * @return
     */
    public Response failure400(String message, Object data) {
        this.code = ERROR_400;
        this.msg = message;
        this.data = data;
        return this;
    }

    /**
     * no privilege
     * @param message
     * @return
     */
    public Response failure401(String message) {
        this.code = ERROR_401;
        this.msg = message;
        return this;
    }

    /**
     *  no privilege
     * @param message
     * @param data
     * @return
     */
    public Response failure401(String message, Object data) {
        this.code = ERROR_401;
        this.msg = message;
        this.data = data;
        return this;
    }

    public Response failure500(String message) {
        this.code = ERROR_500;
        this.msg = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}