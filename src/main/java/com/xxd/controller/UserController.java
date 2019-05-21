package com.xxd.controller;

import com.xxd.entity.User;
import com.xxd.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * + @author Xuxiaodong
 * + @description用户Controller
 * + @date 2019/3/7
 * + @E-mail 504391883@qq.com
 */
@Api(value = "有关用户的操作", description = "有关用户的操作")
@RestController
@RequestMapping(value = "/apis/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @ApiOperation(value="获取全部用户信息",tags={"有关用户的操作"},notes="此接口为所有用户信息，仅仅为前期测试调用")
  @GetMapping("/all")
   public List<User> getAll()
   {
       return  userServiceImpl.getAll();
   }
}
