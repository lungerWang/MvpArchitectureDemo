package com.example.lunger.domain.exception;

/**
 * Created by Allen on 2016/10/14.
 * 异常的封装
 */
public class BaseException extends RuntimeException {

    private ErrorCode errorCode;

    public BaseException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;

    }

    public BaseException(String detailMessage, ErrorCode errorCode) {
        super(detailMessage);
        this.errorCode = errorCode;
    }

    public BaseException(String detailMessage, Throwable throwable, ErrorCode errorCode) {
        super(detailMessage, throwable);
        this.errorCode = errorCode;
    }

    public BaseException(Throwable throwable, ErrorCode errorCode) {
        super(throwable);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
