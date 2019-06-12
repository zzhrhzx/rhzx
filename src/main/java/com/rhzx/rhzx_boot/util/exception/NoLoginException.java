package com.rhzx.rhzx_boot.util.exception;

/**
 * 当无法取得登录用户信息时抛出此异常
 */
public class NoLoginException extends RuntimeException {

    /**  */
    private static final long serialVersionUID = -4146070319325225155L;

    private String url = "/index";

    public NoLoginException() {
        super();
    }

    public NoLoginException(String message) {
        super(message);
    }

    public NoLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLoginException(Throwable cause) {
        super(cause);
    }

    public NoLoginException(String message, String url) {
        super(message);
        this.url = url;
    }

    public NoLoginException(String message, Throwable cause, String url) {
        super(message, cause);
        this.url = url;
    }

    public NoLoginException(Throwable cause, String url) {
        super(cause);
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
