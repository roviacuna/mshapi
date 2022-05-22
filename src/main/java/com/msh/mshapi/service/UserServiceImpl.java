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
    public void deleteUser(User user) {
        iUserDao.delete(user);
    }

    @Override
    public User getUser(String id) {
        return iUserDao.findById(id).orElse(null);
    }
}
