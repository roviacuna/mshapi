package com.msh.mshapi.service;

import com.msh.mshapi.dao.IUserDao;
import com.msh.mshapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private IUserDao iUserDao;

    @Override
    public List<User> allUsers() {
        return (List<User>) iUserDao.findAll();
    }

    @Override
    public User saveUser(User user) {
       return iUserDao.save(user);
    }

    @Override
    public List<User> deleteUser(User user, int id) {
        iUserDao.delete(user);
        return (List<User>) iUserDao.findAll();
    }

    @Override
    public User getUser(int id) {
        return iUserDao.findById(String.valueOf(id)).orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return iUserDao.save(user);
    }
}
