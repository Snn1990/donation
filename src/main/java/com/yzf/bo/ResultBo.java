package com.yzf.bo;

/**
 * Created by nan on 2017/8/10.
 */
public class ResultBo<T> {
    //错误码
    private Integer codeId;
    //错误描述
    private String message;
    //具体返回内容
    private T data;



    public ResultBo(Integer codeId, String message, T data) {
        this.codeId = codeId;
        this.message = message;
        this.data = data;
    }

    public ResultBo(Integer codeId, String message) {
        this.codeId = codeId;
        this.message = message;
    }

    public ResultBo() {
    }

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultBo{" +
                "codeId=" + codeId +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

