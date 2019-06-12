package com.rhzx.rhzx_boot.util.exception;

/**
 * 登录失败的不同提示
 */
public class ServiceException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -6617611651084440676L;

    public ServiceException(String message) {
        super(message);
    }
}
