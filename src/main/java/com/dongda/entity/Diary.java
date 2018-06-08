package com.dongda.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Diary extends DiaryKey {
    private String title;

    private String image;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Integer mood;

    private Integer weather;

    private String content;

    public Diary(String userId, Date diaryStamp, String title, String image, BigDecimal longitude, BigDecimal latitude, Integer mood, Integer weather, String content) {
        super(userId, diaryStamp);
        this.title = title;
        this.image = image;
        this.longitude = longitude;
        this.latitude = latitude;
        this.mood = mood;
        this.weather = weather;
        this.content = content;
    }

    public Diary() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Integer getMood() {
        return mood;
    }

    public void setMood(Integer mood) {
        this.mood = mood;
    }

    public Integer getWeather() {
        return weather;
    }

    public void setWeather(Integer weather) {
        this.weather = weather;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}