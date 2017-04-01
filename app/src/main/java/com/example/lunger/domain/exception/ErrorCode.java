package com.example.lunger.domain.exception;

/**
 * Created by Lunger on 2017/04/01.
 * 异常的类型
 */
public enum  ErrorCode {

    SERVER_DATA_ERROR(0x1, "暂无数据"),
    ;


    private int errorCode;
    private String errorMessage;

    ErrorCode(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
