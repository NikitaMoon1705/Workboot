package com.workboot.server.service;

import com.workboot.server.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikita on 19.06.17.
 */
@Service
public class UserServiceImpl implements UserService{

    private static List<User> items = new ArrayList<>();
    static
    {
        items.add(new User(1,"Nick","Shar",297322112));
        items.add(new User(2,"Petr","Kill",297377172));
    }

    public List<User> getAll() {return items;}

    public User findOneUser(int phone) {return items.get(phone);}



}
