package com.fengxiansheng.Common;

import lombok.Data;
import java.io.Serializable;

/**
 * 通用返回结果封装类
 * 适用于 Spring Boot 接口统一返回格式
 * @param <T> 泛型，支持返回任意类型数据
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码：200 成功，其他为失败
     */
    private int code;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 数据对象
     */
    private T data;

    // ==================== 构造方法 ====================
    public Result() {
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // ==================== 成功返回 ====================
    public static <T> Result<T> success() {
        return new Result<>(200, "操作成功", null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(200, "操作成功", data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(200, msg, data);
    }

    // ==================== 失败返回 ====================
    public static <T> Result<T> error() {
        return new Result<>(500, "操作失败", null);
    }

    public static <T> Result<T> error(String msg) {
        return new Result<>(500, msg, null);
    }

    public static <T> Result<T> error(int code, String msg) {
        return new Result<>(code, msg, null);
    }

    // ==================== 快速判断是否成功 ====================
    public boolean isSuccess() {
        return this.code == 200;
    }
}