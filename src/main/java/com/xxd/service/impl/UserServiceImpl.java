package com.xxd.service.impl;

import com.xxd.entity.User;
import com.xxd.mapper.UserMapper;
import com.xxd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * + @author Xuxiaodong
 * + @description 用户service
 * + @date 2019/3/7
 * + @E-mail 504391883@qq.com
 */
@Component
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAll()
    {
        return userMapper.getAll();
    }
}
