package com.rhzx.rhzx_boot.util.exception;

/**
 * 没有权限异常
 */
public class NoPrivilegeException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -1043130807006665821L;

    private String url = "/norole";

    public NoPrivilegeException() {
        super();
    }

    public NoPrivilegeException(String message) {
        super(message);
    }

    public NoPrivilegeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPrivilegeException(Throwable cause) {
        super(cause);
    }

    public NoPrivilegeException(String message, String url) {
        super(message);
        this.url = url;
    }

    public NoPrivilegeException(String message, Throwable cause, String url) {
        super(message, cause);
        this.url = url;
    }

    public NoPrivilegeException(Throwable cause, String url) {
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
