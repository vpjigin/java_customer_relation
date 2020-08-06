package com.lulixe.rkaraapi.entity;

public class ResponceJson {
    int success;

    public ResponceJson(int success, int errorCode, String message) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
    }

    int errorCode;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;
}
