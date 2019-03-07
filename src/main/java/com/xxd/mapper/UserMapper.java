package com.xxd.mapper;

import com.xxd.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getAll();

}
