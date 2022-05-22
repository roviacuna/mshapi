package com.msh.mshapi.service;

import com.msh.mshapi.entity.User;

import java.util.List;

public interface UserService {
    public List<User> allUsers();
    public User saveUser (User user);
    public List<User> deleteUser (User user, int id);
    public User getUser(int id);
    public User updateUser(User user);

}
