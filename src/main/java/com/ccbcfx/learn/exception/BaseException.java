package com.ccbcfx.learn.exception;

/**
 * @Description:
 * @Author: 陆志庆
 * @CreateDate: 2019/3/6 11:44
 */
public abstract class BaseException extends RuntimeException{
    private int errorCode;

    public BaseException(int errorCode) {
        this.errorCode = errorCode;
    }
    public BaseException(int errorCode,String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
