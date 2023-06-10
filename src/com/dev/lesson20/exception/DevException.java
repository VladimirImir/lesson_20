package com.dev.lesson20.exception;

public class DevException extends RuntimeException{

    public DevException(String message) {
        super(message);
    }

    public DevException(Throwable cause) {
        super(cause);
    }
}
