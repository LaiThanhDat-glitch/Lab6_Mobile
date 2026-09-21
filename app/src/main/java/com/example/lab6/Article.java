package com.example.lab6;

import java.io.Serializable;

public class Article implements Serializable {
    private String title;
    private String content;
    private int imgCover; // ID ảnh trong thư mục res/drawable
    private int views;

    public Article(String title, String content, int imgCover, int views) {
        this.title = title;
        this.content = content;
        this.imgCover = imgCover;
        this.views = views;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
    public int getImgCover() { return imgCover; }
    public int getViews() { return views; }
    public void setViews(int views) { this.views = views; }
}
