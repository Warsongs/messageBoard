package com.dongda.entity;

public class User {
    private String userId;

    private String userTx;

    private String userNick;

    private String userProvince;

    private String userCity;

    private Integer userGender;

    private Integer userAge;

    public User(String userId, String userTx, String userNick, String userProvince, String userCity, Integer userGender, Integer userAge) {
        this.userId = userId;
        this.userTx = userTx;
        this.userNick = userNick;
        this.userProvince = userProvince;
        this.userCity = userCity;
        this.userGender = userGender;
        this.userAge = userAge;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserTx() {
        return userTx;
    }

    public void setUserTx(String userTx) {
        this.userTx = userTx == null ? null : userTx.trim();
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick == null ? null : userNick.trim();
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}