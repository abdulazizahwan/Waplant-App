package com.example.waplantapp;

public class ScreenItem {
    String Title, Description;
    int ScreenImg;

    public ScreenItem(String title, String decription, int screenImg){
        Title = title;
        Description = decription;
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}
