package com.dongda.entity;

public class FriendKey {
    private String userId;

    private String friendId;

    public FriendKey(String userId, String friendId) {
        this.userId = userId;
        this.friendId = friendId;
    }

    public FriendKey() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId == null ? null : friendId.trim();
    }
}