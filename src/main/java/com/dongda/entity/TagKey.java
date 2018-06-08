package com.dongda.entity;

public class TagKey {
    private Integer msbdId;

    private String userId;

    public TagKey(Integer msbdId, String userId) {
        this.msbdId = msbdId;
        this.userId = userId;
    }

    public TagKey() {
        super();
    }

    public Integer getMsbdId() {
        return msbdId;
    }

    public void setMsbdId(Integer msbdId) {
        this.msbdId = msbdId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}