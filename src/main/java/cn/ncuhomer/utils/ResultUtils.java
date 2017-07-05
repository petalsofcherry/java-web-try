package cn.ncuhomer.utils;

import cn.ncuhomer.domain.Result;

/**
 * Created by luojingyu on 17-7-5.
 */
public class ResultUtils {
    public static Result success(Object object) {
        return new Result(0, "成功", object);
    }

    public static Result error(String msg) {
        return new Result(2, msg);
    }
}
