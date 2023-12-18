package com.hb.demo.test_hb.test_10;

public enum BaseCode {

    /**
     * 表示请求成功完成，并返回响应数据
     */
    SUCCESS("2000", "SUCCESS"),
    /**
     * 表示成功创建了资源，并返回响应数据
     */
    CREATED("2001", "CREATED"),
    /**
     * 表示成功更新了数据，并返回响应数据
     */
    UPDATED("2002", "UPDATED"),
    /**
     * 表示成功处理了请求，但没有返回响应数据
     */
    NO_CONTENT("2004", "NO_CONTENT"),
    /**
     * 表示成功上传了文件，并返回响应数据
     */
    UPLOADED("2005", "UPLOADED"),
    /**
     * 表示成功下载了文件，并返回响应数据
     */
    DOWNLOADED("2006", "DOWNLOADED"),
    /**
     * 表示客户端发出了错误的请求，例如请求参数错误或缺失
     */
    BAD_REQUEST("4000", "BAD_REQUEST"),
    /**
     * 表示未经授权，需要进行身份验证
     */
    UNAUTHORIZED("4001", "UNAUTHORIZED"),
    /**
     * 表示禁止访问，请求被拒绝
     */
    FORBIDDEN("4003", "FORBIDDEN"),
    /**
     * 表示请求的资源不存在
     */
    NOT_FOUND("4004", "NOT_FOUND"),
    /**
     * 表示请求重复
     */
    DUPLICATE_REQUEST("4005", "DUPLICATE_REQUEST"),
    /**
     * 不被允许的上传文件格式
     */
    NOT_ALLOWED_FILE_FORMAT("4006", "NOT_ALLOWED_FILE_FORMAT"),
    /**
     * 表示用户名或密码错误
     */
    USERNAME_PASSWORD_ERROR("1001", "USERNAME_PASSWORD_ERROR"),
    /**
     * 表示权限不足，无法执行请求的操作
     */
    INSUFFICIENT_PERMISSIONS("1002", "INSUFFICIENT_PERMISSIONS"),
    /**
     * 表示请求的资源已存在
     */
    RESOURCE_ALREADY_EXISTS("1003", "RESOURCE_ALREADY_EXISTS"),
    /**
     * 表示服务器处理异常
     */
    SERVER_INTERNAL_ERROR("5000", "SERVER_INTERNAL_ERROR");

    private final String code;
    private final String message;

    BaseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static String getMessageByCode(String code) {
        for (BaseCode baseCode : BaseCode.values()) {
            if (baseCode.code.equals(code)) {
                return baseCode.message;
            }
        }
        return null;
    }

}
