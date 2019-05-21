package com.xxd.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * + @author Xuxiaodong
 * + @description用户实体类
 * + @date 2019/3/7
 * + @E-mail 504391883@qq.com
 */

@Component
@Data
public class User implements Serializable {
    private  int id;
    private String username;
    private  String password;
    private String nickname;
    private String avatar;
    private long createtime ;
    private long updatetime;
    private int delflag;


}
