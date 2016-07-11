package com.carrey.beautiful.bean;

/**
 * @author : carrey
 * @Date : 16-7-11
 * @describe :
 */
public class HttpResult<T> {
    private boolean status;
    private int total;
    private String message;
    private T data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
}
