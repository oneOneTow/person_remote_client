package com.ccbcfx.learn.exception;

/**
 * @Description:
 * @Author: 陆志庆
 * @CreateDate: 2019/3/5 19:13
 */
public class UnloginException extends BaseException {
    public UnloginException(){
        super(ErrorCode.UN_LOGIN,"用户未登录");
    }
    public UnloginException(String errorMsg){
        super(ErrorCode.UN_LOGIN,errorMsg);
    }
}
