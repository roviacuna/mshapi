package com.msh.mshapi.service;

import com.msh.mshapi.entity.User;

import java.util.List;

public interface UserService {
    public List<User> allUsers();
    public void saveUser (User user);
    public void deleteUser (User user);
    public User getUser(String id);

}
