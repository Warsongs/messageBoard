package com.dongda.entity;

import java.util.Date;

public class DiaryKey {
    private String userId;

    private Date diaryStamp;

    public DiaryKey(String userId, Date diaryStamp) {
        this.userId = userId;
        this.diaryStamp = diaryStamp;
    }

    public DiaryKey() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getDiaryStamp() {
        return diaryStamp;
    }

    public void setDiaryStamp(Date diaryStamp) {
        this.diaryStamp = diaryStamp;
    }
}