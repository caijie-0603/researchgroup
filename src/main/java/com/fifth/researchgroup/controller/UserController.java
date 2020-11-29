package com.fifth.researchgroup.controller;

import com.fifth.researchgroup.entity.Resume;
import com.fifth.researchgroup.entity.User;
import com.fifth.researchgroup.service.ResumeService;
import com.fifth.researchgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ResumeService resumeService;

    @PostMapping("/user/add")
    public void addUser(User user)
    {
        userService.addUser(user);
        Resume resume = new Resume();
        resume.setUser_id(user.getId());
        resumeService.addResume(resume);
    }

    @GetMapping("/user/findAllUsers")
    public void findAllUsers()
    {
        List<User> users = userService.findAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
