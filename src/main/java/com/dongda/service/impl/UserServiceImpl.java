package com.dongda.service.impl;

import com.dongda.dao.UserMapper;
import com.dongda.entity.Location;
import com.dongda.entity.User;
import com.dongda.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    /*@Resource
    private UserExample userExample;*/

    @Override
    public List<User> getUserList() {
        return userMapper.queryAllUser();
    }

    @Override
    public List<User> getUserListByDistance(Location location) {
        return null;
    }

    @Override
    public User getUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}
