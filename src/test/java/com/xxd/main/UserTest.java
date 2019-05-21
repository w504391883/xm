package com.xxd.main;

import com.xxd.entity.User;
import com.xxd.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserTest extends BaseTest {

    @Override
    public void before() {
        super.before();
    }
    @Autowired
    UserServiceImpl userServiceImpl;
    @Test
    public void getUserAll()
    {
        List<User> userList = userServiceImpl.getAll();
        Assert.assertNotNull(userList);
    }
    @Override
    public void after() {
        super.after();
    }
}
