package com.example.lunger.data.param;

import java.io.Serializable;

/**
 * Created by Lunger on 2017/3/31.
 * 具体请求所用的参数封装
 */

public class ParentLibParam implements Serializable {

    private String token;
    private String catid;
    private String page;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCatid() {
        return catid;
    }

    public void setCatid(String catid) {
        this.catid = catid;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
