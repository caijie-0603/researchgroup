package com.fifth.researchgroup.service;

import com.fifth.researchgroup.entity.User;
import org.apache.ibatis.annotations.Param;

public interface LoginService {
    public User login(String username, String password);


}
