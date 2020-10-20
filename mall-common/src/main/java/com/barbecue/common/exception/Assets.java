package com.barbecue.common.exception;

import com.barbecue.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 */
public class Assets {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
