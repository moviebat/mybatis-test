package com.dyq.mybatis.controller;

import com.dyq.mybatis.model.User;
import com.dyq.mybatis.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: mybatis-test
 * @ClassName: UserController
 * @description:
 * @author: Dengyq
 * @create: 2019-02-25 15:23
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 添加一个用户
     * @param userName
     * @param password
     * @param email
     * @return
     */
    @GetMapping(value = "/insertUser")
    @ResponseBody
    public Object inserUser(@Param("userName") String userName, @Param("password") String password, @Param("email") String email){
        Map<String,Object> data = new HashMap<>();
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        userService.insertUser(user);
        data.put("code","0");
        data.put("message","添加成功！");
        return data;
    }

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    @GetMapping(value = "/findByUserName")
    @ResponseBody
    public Object findByUserName(@Param("userName")String userName){
        Map<String,Object> data = new HashMap<>();
        User user = userService.findByUserName(userName);
        if (null != user) {
            data.put("user",user);
            data.put("code","0");
            data.put("message","查询成功！");
        } else {
            data.put("code","0");
            data.put("message","没有找到用户！");
        }
        return data;
    }

    /**
     * 根据Id删除用户
     * @param id
     * @return
     */
    @GetMapping(value = "/deleteUserById")
    @ResponseBody
    public Object deleteUserById(@Param("id")Long id){
        Map<String,Object> data = new HashMap<>();
        userService.deleteUserById(id);
        data.put("code","0");
        data.put("message","删除成功！");
        return data;
    }

    /**
     * 根据用户名更新密码
     * @param password
     * @param userName
     * @return
     */
    @GetMapping(value = "/updatePassword")
    @ResponseBody
    public Object updatePassword(@Param("password")String password,@Param("userName")String userName){
        Map<String,Object> data = new HashMap<>();
        User user = userService.findByUserName(userName);
        if (null != user) {
            user.setPassword(password);
            userService.updatePassword(user);
            data.put("user",user);
            data.put("code","0");
            data.put("message","修改成功！");
        } else {
            data.put("code","0");
            data.put("message","没有找到用户！");
        }
        return data;
    }
}
