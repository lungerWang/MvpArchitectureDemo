package com.example.lunger.data.param;

import java.io.Serializable;

/**
 * Created by Allen on 2017/3/31.
 * 具体请求所用的参数封装
 */

public class ParentLibParam implements Serializable {

    private String token;
    private String categoryId;
    private String page;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
