package com.lzp.springmvc.exception;

public class StudentException extends RuntimeException {

    private String exceptionMsg;

    public StudentException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptonMsg() {
        return exceptionMsg;
    }

    public void setExceptonMsg(String exceptonMsg) {
        this.exceptionMsg = exceptonMsg;
    }
}
