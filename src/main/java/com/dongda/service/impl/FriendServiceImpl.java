package com.dongda.service.impl;

import com.dongda.dao.FriendMapper;
import com.dongda.entity.FriendKey;
import com.dongda.service.FriendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="friendService")
public class FriendServiceImpl implements FriendService {

    @Resource
    private FriendMapper friendMapper;

    /*根据userId查询好友列表*/
    @Override
    public List<FriendKey> getFriendList(String userId) {
        return friendMapper.queryAllFriendByUserId(userId);
    }

    @Override
    public FriendKey getFriendById(String friendId) {
        return null;
    }

    @Override
    public int addFriend(FriendKey friend) {
        return friendMapper.insert(friend);
    }

    @Override
    public int deleteFriend(FriendKey friend) {
        return friendMapper.deleteByPrimaryKey(friend);
    }
}
