package com.hb.demo.test_hb.test_10;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class BaseResult<E> implements Serializable {
    private Boolean success;

    private String code;

    private String msg;

    private E data;

    public BaseResult(Boolean success, String code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public BaseResult(Boolean success, String code, String msg, E data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> BaseResult<T> success() {
        return new BaseResult<>(true, BaseCode.SUCCESS.getCode(), BaseCode.SUCCESS.getMessage());
    }

    public static <T> BaseResult<T> success(T data) {
        return new BaseResult<>(true, data == null ? "2004" : BaseCode.SUCCESS.getCode(), data == null ? BaseCode.getMessageByCode("2004") : BaseCode.SUCCESS.getMessage(), data);
    }

    public static <T> BaseResult<T> success(String code, String message, T data) {
        return new BaseResult<>(true, code, message, data);
    }

    public static <T> BaseResult<T> success(String code, String message) {
        return new BaseResult<>(true, code, message);
    }

    public static <T> BaseResult<T> fail() {
        return new BaseResult<>(false, BaseCode.BAD_REQUEST.getCode(), BaseCode.BAD_REQUEST.getMessage());
    }

    public static <T> BaseResult<T> fail(String code) {
        return new BaseResult<>(false, code, BaseCode.getMessageByCode(code));
    }

    public static <T> BaseResult<T> fail(String code, String message) {
        return new BaseResult<>(false, code, message);
    }

    public static <T> BaseResult<T> fail(String code, String message, T data) {
        return new BaseResult<>(false, code, message, data);
    }

    public static <T> BaseResult<T> status(String code) {
        return new BaseResult<>(true, code, BaseCode.getMessageByCode(code));
    }
}
