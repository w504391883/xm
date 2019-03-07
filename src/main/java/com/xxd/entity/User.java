package com.xxd.entity;

import org.springframework.stereotype.Component;

/**
 * + @author Xuxiaodong
 * + @description用户实体类
 * + @date 2019/3/7
 * + @E-mail 504391883@qq.com
 */
@Component
public class User {
    private  int uid;
    private String username;
    private  String password;
    private String nickname;
    private String phone;
    private String headportrait;
    private int state;
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadportrait() {
        return headportrait;
    }

    public void setHeadportrait(String headportrait) {
        this.headportrait = headportrait;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", headportrait='" + headportrait + '\'' +
                ", state=" + state +
                '}';
    }


}
