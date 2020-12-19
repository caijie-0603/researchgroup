package com.fifth.researchgroup.service.impl;

import com.fifth.researchgroup.dao.LoginDao;
import com.fifth.researchgroup.dao.UserDao;
import com.fifth.researchgroup.entity.User;
import com.fifth.researchgroup.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Autowired
    private UserDao userDao;
    @Override
    public User login(String username, String password) {
        User user = loginDao.login(username,password);
        if(user!=null)
        {
            if(user.getPassword().equals(password))
            {
                return user;
            }
        }
        return null;
    }


}
