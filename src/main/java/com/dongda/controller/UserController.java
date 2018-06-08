package com.dongda.controller;

import com.dongda.entity.Location;
import com.dongda.entity.User;
import com.dongda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/list",method= RequestMethod.GET)
    @ResponseBody
    private List<User> list(Model model){
        List<User> userList = userService.getUserList();
        model.addAttribute("list",userList);
        return userList;
    }

    @RequestMapping(value="/listNearbyUser",method= RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    private List<User> listnearbyUser(@RequestBody Location location){

        List<User> userList = userService.getUserListByDistance(location);
        return userList;
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    private String add(@RequestBody User user) {
        User existUser = userService.getUserById(user.getUserId());
        int i = -1;
        if (existUser == null) {
            i = userService.addUser(user);
        }
        return i > 0 ? "success" : "error";
    }
}
