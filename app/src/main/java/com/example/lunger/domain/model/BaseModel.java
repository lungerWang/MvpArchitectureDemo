package com.example.lunger.domain.model;

import java.io.Serializable;

/**
 * Created by Lunger on 2016/5/30.
 */
public class BaseModel implements Serializable {

    private long id;
    private int status;
    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
