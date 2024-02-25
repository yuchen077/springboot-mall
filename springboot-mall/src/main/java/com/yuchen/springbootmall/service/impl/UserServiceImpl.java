package com.yuchen.springbootmall.service.impl;

import com.yuchen.springbootmall.dao.UserDao;
import com.yuchen.springbootmall.dto.UseRegisterRequest;
import com.yuchen.springbootmall.model.User;
import com.yuchen.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UseRegisterRequest useRegisterRequest) {
        return userDao.createUser(useRegisterRequest);
    }
}
