package com.dongda.controller;

import com.dongda.entity.FriendKey;
import com.dongda.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/friend")
public class FriendController {
    @Autowired
    private FriendService friendService;

    /*根据userId查询好友列表*/
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    private List<FriendKey> list(@RequestBody FriendKey friend) {
        List<FriendKey> friendList = friendService.getFriendList(friend.getUserId());
        return friendList;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    private String add(@RequestBody FriendKey friend) {
        int i = friendService.addFriend(friend);
        return i > 0 ? "success" : "error";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    private int delete(@RequestBody FriendKey friend) {
        int i = friendService.deleteFriend(friend);
        return i > 0 ? 1 : -1;

    }
}
