package com.dongda.service;

import com.dongda.entity.Location;
import com.dongda.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    List<User> getUserListByDistance(Location location);
    User getUserById(String userId);
    int addUser(User user);
}
