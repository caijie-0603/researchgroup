package com.fifth.researchgroup.service.impl;

import com.fifth.researchgroup.dao.UserDao;
import com.fifth.researchgroup.entity.User;
import com.fifth.researchgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> findAllUsers(){
        List<User> users = new ArrayList<>();
        users = userDao.findAllUsers();
        return users;
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

}
