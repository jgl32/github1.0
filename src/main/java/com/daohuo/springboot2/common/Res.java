package com.daohuo.springboot2.common;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther zxl
 * @Date 2018/12/12 9:31
 * @Description 响应结果
 **/
public class Res extends HashMap<String, Object> {

    public Res() {
        put("code", 200);
        put("msg", "success");
    }

    public static Res error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常!");
    }

    public static Res error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static Res error(int code, String msg) {
        Res r = new Res();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Res ok(String msg) {
        Res r = new Res();
        r.put("msg", msg);
        return r;
    }

    public static Res ok(Map<String, Object> map) {
        Res r = new Res();
        r.putAll(map);
        return r;
    }

    public static Res ok() {
        return new Res();
    }

    public Res put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
