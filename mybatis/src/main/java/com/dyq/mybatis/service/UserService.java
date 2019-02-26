package com.dyq.mybatis.service;

import com.dyq.mybatis.model.User;

public interface UserService {

    User findByUserName(String userName);

    void insertUser(User user);

    void deleteUserById(Long id);

    void updatePassword(User user);

}
