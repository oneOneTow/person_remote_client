package com.ccbcfx.learn.exception;

/**
 * @Description: 校验异常
 * @Author: 陆志庆
 * @CreateDate: 2019/3/5 18:17
 */
public class CheckException extends BaseException {


    public CheckException() {
        super(ErrorCode.CHECK_FAIL);
    }

    public CheckException(String errorMsg) {
        super(ErrorCode.CHECK_FAIL,errorMsg);
    }


}
