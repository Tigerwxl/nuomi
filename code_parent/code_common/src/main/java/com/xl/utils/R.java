package com.xl.utils;

import com.xl.entity.Result;

import java.util.HashMap;
import java.util.Map;

/**
 */
public class R extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public R() {
        put("code", 200);
    }

    public static R error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }
    public static R error(int code, String msg,Object obj) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        r.put("data", obj);
        return r;
    }
    public static R ok(int code,String msg) {
        R r = new R();
        r.put("msg", msg);
        r.put("code", code);
        return r;
    }
    public static R ok(Object obj) {
        R r = new R();
        r.put("msg", "success");
        r.put("code", 200);
        r.put("data", obj);
        return r;
    }
    public static R ok(Map<String, Object> map,String msg) {
        R r = new R();
        r.put("code", 200);
        r.put("data", map);
        r.put("msg",msg);
        return r;
    }


    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }


}