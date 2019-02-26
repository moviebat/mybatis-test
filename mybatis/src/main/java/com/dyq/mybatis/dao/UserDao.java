package com.dyq.mybatis.dao;

import com.dyq.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 配置了Mapper.xml文件
 **/
@Mapper
public interface UserDao {

    User findByUserName(String name);

    void insertUser(User user);

    void deleteUserById(Long ID);

    void updatePassword(User user);

}
