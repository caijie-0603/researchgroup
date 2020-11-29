package com.fifth.researchgroup.dao;

import com.fifth.researchgroup.entity.User;

import java.util.List;

public interface UserDao {

    public void addUser(User user);     //新增成员

    public List<User> findAllUsers();   //查询所有成员

    public User findUserById(int id);   //查出单个成员

}
