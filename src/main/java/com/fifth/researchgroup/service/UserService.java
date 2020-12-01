package com.fifth.researchgroup.service;

import com.fifth.researchgroup.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public int addUser(User user);

    public List<User> findAllUsers();   //查询所有成员

    public User findUserById(int id);   //查出单个成员

    public User findUserByPhone(String phone_number);   //根据用户名（电话号码）查出单个成员

}

