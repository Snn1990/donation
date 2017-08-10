package com.yzf.utils;

import com.yzf.bo.ResultBo;


/**
 * Created by nan on 2017/5/4.
 */
public class ResultUtil {

    public static ResultBo success(Object object) {
        ResultBo resultBo = new ResultBo();
        resultBo.setData(object);
        resultBo.setMessage("success");
        resultBo.setCodeId(1);
        return resultBo;
    }

    public static ResultBo success() {
        return success(null);
    }

    public static ResultBo faild(Integer code, String errMessage) {
        ResultBo resultBo = new ResultBo();
        resultBo.setData(null);
        resultBo.setMessage(errMessage);
        resultBo.setCodeId(code);
        return resultBo;
    }
}
