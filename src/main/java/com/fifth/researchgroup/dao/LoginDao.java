package com.fifth.researchgroup.dao;

import com.fifth.researchgroup.entity.User;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {
    public User login(@Param("username") String username, String password);

}
