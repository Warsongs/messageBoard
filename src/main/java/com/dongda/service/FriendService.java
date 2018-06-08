package com.dongda.service;


import com.dongda.entity.FriendKey;

import java.util.List;

public interface FriendService {

    /*根据userId查询好友列表*/
    List<FriendKey> getFriendList(String userId);

    FriendKey getFriendById(String friendId);

    int addFriend(FriendKey friend);

    int deleteFriend(FriendKey friend);
}
