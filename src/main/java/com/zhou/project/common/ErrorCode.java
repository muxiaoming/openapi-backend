package com.zhou.project.common;

/**
 * 错误码
 *
 * @author zhou
 */
public enum ErrorCode {

    /**
     * 0: ok
     */
    SUCCESS(0, "ok"),
    /**
     * 40000: 请求参数错误
     */
    PARAMS_ERROR(40000, "请求参数错误"),

    /**
     * 请求参数格式异常, 请求参数必需为JSON格式, 请按输入框提示输入, 形如: {\"username\":\"zhou\"}
     */
    PARAMS_FORMAT_ERROR(40001, "请求参数格式异常, " +
            "请求参数必需为JSON格式, 请按输入框提示输入, 形如: {\"username\":\"zhou\"}"),

    /**
     * 接口调用异常, 请联系管理员或者稍后再试!
     */
    INTERFACE_INVOKE_ERROR(40002, "接口调用异常, 请联系管理员或者稍后再试!"),

    /**
     * 40100: 未登录
     */
    NOT_LOGIN_ERROR(40100, "未登录"),
    /**
     * 40101: 无权限
     */
    NO_AUTH_ERROR(40101, "无权限"),
    /**
     * 40400: 请求数据不存在
     */
    NOT_FOUND_ERROR(40400, "请求数据不存在"),
    /**
     * 40300: 禁止访问
     */
    FORBIDDEN_ERROR(40300, "禁止访问"),
    /**
     * 50000: 系统内部异常
     */
    SYSTEM_ERROR(50000, "系统内部异常"),
    /**
     * 50001: 操作失败
     */
    OPERATION_ERROR(50001, "操作失败");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    /*public ErrorCode[] getValues() {
        return ErrorCode.values();

    }*/
}
