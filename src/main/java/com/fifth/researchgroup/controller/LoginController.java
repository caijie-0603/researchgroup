package com.fifth.researchgroup.controller;


import com.fifth.researchgroup.entity.User;
import com.fifth.researchgroup.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/user/login")
    public User login(String username,String password)      //返回0：用户名密码错误 1：老师或学生 2：信息发布员 3：审核员
    {

        User user = loginService.login(username,password);
        if(user==null)
        {
            return null;
        }
        return user;
    }



}
