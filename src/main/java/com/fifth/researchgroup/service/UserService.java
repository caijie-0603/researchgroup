package com.fifth.researchgroup.service;

import com.fifth.researchgroup.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public int addUser(User user);

    public List<User> findAllUsers();   //查询所有成员

    public User findUserById(int id);   //查出单个成员

    public User findUserByPhone(String phoneNumber);   //根据用户名（电话号码）查出单个成员

    public int updatePassword(User user);              //修改密码

    public int updateUser(User user);           //修改角色信息


}

