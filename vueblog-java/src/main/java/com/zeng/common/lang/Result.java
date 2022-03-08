package com.zeng.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private String code;    //200正常，非200不正常
    private String msg;
    private Object data;

    public static Result succ(String mess,Object data){
        Result r = new Result();
        r.setCode("200");
        r.setData(data);
        r.setMsg(mess);

        return r;
    }
    public static Result succ(Object data){
        Result r = new Result();
        r.setCode("200");
        r.setData(data);
        r.setMsg("操作成功");

        return r;
    }

    public static Result fail(String mess){
        Result r = new Result();
        r.setCode("400");
        r.setData(null);
        r.setMsg(mess);

        return r;
    }
    public static Result fail(String mess,Object data){
        Result r = new Result();
        r.setCode("400");
        r.setData(data);
        r.setMsg(mess);

        return r;
    }

    public static Result fail(String code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);

        return r;
    }
}
