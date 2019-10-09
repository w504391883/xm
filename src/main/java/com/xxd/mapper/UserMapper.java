package com.xxd.mapper;

import com.xxd.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getAll();

}
