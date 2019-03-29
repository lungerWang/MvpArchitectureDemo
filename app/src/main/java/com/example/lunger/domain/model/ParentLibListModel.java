package com.example.lunger.domain.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Allen on 2017/3/31.
 * 爸媽圖書館list数据
 */
public class ParentLibListModel implements Serializable{

    int status; //数据状态
    String message; //消息

    java.util.List<List> data = new ArrayList<>();

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

    public java.util.List<List> getData() {
        return data;
    }

    public void setData(java.util.List<List> data) {
        this.data = data;
    }

    public static class List {

        String aid;         //480
        String author;
        String catid;       //17
        String catname;     // 寶貝照護
        String dateline;    // 17-02-22 17:08:17
        String isthumb;     // 1
        String pic;         // http://www.baby-kingdom.com.tw/data/attachment/portal/201702/22/170649mlall1c5ql99ml19.jpg.thumb.jpg
        String summary;     // 原文出處： 對二寶的愧疚之心
        String title;       // [育兒] 對二寶的愧疚之心
        String uid;         // 626
        String username;    // 親子王國
        String views;       // 26
        String webviewurl;  // http://bapi.baby-kingdom.com.tw/index.php?mod=portal&op=bookshow&ver=2.0.0&app=android&aid=480&ipadflag=&token=

        public String getAid() {
            return aid;
        }

        public void setAid(String aid) {
            this.aid = aid;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCatid() {
            return catid;
        }

        public void setCatid(String catid) {
            this.catid = catid;
        }

        public String getCatname() {
            return catname;
        }

        public void setCatname(String catname) {
            this.catname = catname;
        }

        public String getDateline() {
            return dateline;
        }

        public void setDateline(String dateline) {
            this.dateline = dateline;
        }

        public String getIsthumb() {
            return isthumb;
        }

        public void setIsthumb(String isthumb) {
            this.isthumb = isthumb;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getViews() {
            return views;
        }

        public void setViews(String views) {
            this.views = views;
        }

        public String getWebviewurl() {
            return webviewurl;
        }

        public void setWebviewurl(String webviewurl) {
            this.webviewurl = webviewurl;
        }
    }
}
