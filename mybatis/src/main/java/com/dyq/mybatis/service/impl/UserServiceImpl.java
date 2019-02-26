package com.dyq.mybatis.service.impl;

import com.dyq.mybatis.dao.UserDao;
import com.dyq.mybatis.model.User;
import com.dyq.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: mybatis-test
 * @ClassName: UserServiceImpl
 * @description:
 * @author: Dengyq
 * @create: 2019-02-25 15:16
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void updatePassword(User user) {
        userDao.updatePassword(user);
    }
}
