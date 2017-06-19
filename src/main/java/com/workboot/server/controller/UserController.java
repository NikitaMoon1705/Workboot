package com.workboot.server.controller;

import com.workboot.server.model.User;
import com.workboot.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nikita on 18.06.17.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> ShowUser()
    {
        return userService.getAll();
    }

    @RequestMapping(value = "/{phone}", method = RequestMethod.GET)
    public User findUser(@PathVariable("phone") int userPhone) {
        return userService.findOneUser(userPhone);
    }


}
