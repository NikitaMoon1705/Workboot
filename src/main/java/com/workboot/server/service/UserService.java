package com.workboot.server.service;

import com.workboot.server.model.User;

import java.util.List;

/**
 * Created by nikita on 19.06.17.
 */
public interface UserService {

    List<User> getAll();
    User findOneUser(int phone);

}
