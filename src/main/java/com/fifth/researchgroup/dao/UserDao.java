package com.fifth.researchgroup.dao;

import com.fifth.researchgroup.entity.User;

import java.util.List;

public interface UserDao {

    public int addUser(User user);     //新增成员

    public List<User> findAllUsers();   //查询所有成员

    public User findUserById(int id);   //根据id查出单个成员

    public User findUserByPhone(String phoneNumber);   //根据用户名（电话号码）查出单个成员

}
