package com.project.inuadadafaundation.Models;

public class LiveBlogModel {
    String Header;
    String time;
    int Image;
    String text;

    public LiveBlogModel(String header, String time, int image, String text) {
        Header = header;
        this.time = time;
        Image = image;
        this.text = text;
    }

    public String getHeader() {
        return Header;
    }

    public void setHeader(String header) {
        Header = header;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
