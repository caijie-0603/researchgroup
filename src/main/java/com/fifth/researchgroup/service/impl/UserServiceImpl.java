package com.fifth.researchgroup.service.impl;

import com.fifth.researchgroup.dao.ResumeDao;
import com.fifth.researchgroup.dao.UserDao;
import com.fifth.researchgroup.entity.Resume;
import com.fifth.researchgroup.entity.User;
import com.fifth.researchgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private ResumeDao resumeDao;

    @Override
    public int addUser(User user) {
        String phone_number = user.getPhone_number();
        if(userDao.findUserByPhone(phone_number)!=null)
        {
            return 2;       //若用户电话号码则存在返回2
        }
        int result = userDao.addUser(user);
        if(result!=0)
        {
            Resume resume = new Resume();
            resume.setUser_id(user.getId());
            resumeDao.addResume(resume);
            return result;
        }
        return result;
    }

    @Override
    public List<User> findAllUsers(){
        List<User> users;
        users = userDao.findAllUsers();
        return users;
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public User findUserByPhone(String phone_number) {
        return userDao.findUserByPhone(phone_number);
    }

}
