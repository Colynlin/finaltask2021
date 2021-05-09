package com.jz.others.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author ColynLin
 * @Date 2020/10/19 23:25
 */
@Data
public class Result implements Serializable {

    private int status; // normal:1
    private String msg;
    private Object data;

    public static Result success(Object data) {
        return success(1, "操作成功", data);
    }

    public static Result success(int status, String msg, Object data) {
        return setState(status, msg, data);
    }

    public static Result fail(String msg) {
        return fail(0, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(0, msg, data);
    }

    public static Result fail(int status, String msg, Object data) {
        return setState(status, msg, data);
    }

    public static Result setState(int status, String msg, Object data) {
        Result r = new Result();
        r.setStatus(status);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
