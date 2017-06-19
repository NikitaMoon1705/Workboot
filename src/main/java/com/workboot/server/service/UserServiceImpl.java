package com.workboot.server.service;

import com.workboot.server.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikita on 19.06.17.
 */
@Service
public class UserServiceImpl {

    private static List<User> items = new ArrayList<>();
    static
    {
        items.add(new User(1,"Nick","Shar",297322112));
    }

    public List<User> findAll()
    {
        return items;
    }
}
