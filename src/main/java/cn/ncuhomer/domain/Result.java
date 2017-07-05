package cn.ncuhomer.domain;

/**
 * Created by luojingyu on 17-7-5.
 */
public class Result<T> {

    private Integer status;

    private String msg;

    private T data;

    public Result() {

    }

    public Result(Integer status, String msg) {
        this(status, msg, null);
    }

    public Result(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
