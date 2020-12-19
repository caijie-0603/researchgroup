package com.fifth.researchgroup.controller;

import com.fifth.researchgroup.entity.Resume;
import com.fifth.researchgroup.entity.User;
import com.fifth.researchgroup.service.ResumeService;
import com.fifth.researchgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public int addUser(User user)       //返回0代表添加失败 返回1代表添加成功 返回2代表用户电话号码已存在
    {
      return userService.addUser(user);
    }

    @GetMapping("/user/findAllUsers")
    public List<User> findAllUsers()
    {
        return userService.findAllUsers();
    }

    @GetMapping("/user/findUserById")
    public User findUserById(int id)
    {
        return userService.findUserById(id);
    }

    @PutMapping("/user/updatePwd")
    public int updatePassword(@RequestBody User user)
    {

        return userService.updatePassword(user);
    }

    @PutMapping("/user/updateUser")
    public int updateUser(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

}
