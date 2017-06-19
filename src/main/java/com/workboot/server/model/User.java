package com.workboot.server.model;

/**
 * Created by nikita on 18.06.17.
 */
public class User{

    private final long id;

    private final String firstname;

    private final String lastname;

    private final long phone;

    public User(long id, String firstname, String lastname, long phone) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public long getPhone() {
        return phone;
    }
}
