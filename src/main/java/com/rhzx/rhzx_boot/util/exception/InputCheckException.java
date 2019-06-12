package com.rhzx.rhzx_boot.util.exception;

import java.io.Serializable;


public class InputCheckException extends ProgramException implements Serializable {


    private static final long serialVersionUID = -7698842031677220234L;

    public InputCheckException() {
    }

    public InputCheckException(Throwable cause) {
        super(cause.getMessage(), cause);
    }

    public InputCheckException(String message) {
        super(message);
    }

    public InputCheckException(String message, Throwable cause) {
        super(message, cause);
    }
}
