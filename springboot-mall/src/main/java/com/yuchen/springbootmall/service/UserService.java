package com.yuchen.springbootmall.service;

import com.yuchen.springbootmall.dto.UseRegisterRequest;
import com.yuchen.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UseRegisterRequest useRegisterRequest);
}
