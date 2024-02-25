package com.yuchen.springbootmall.dao;

import com.yuchen.springbootmall.dto.UseRegisterRequest;
import com.yuchen.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UseRegisterRequest useRegisterRequest);

}
