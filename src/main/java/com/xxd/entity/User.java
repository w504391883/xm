package com.xxd.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * + @author Xuxiaodong
 * + @description用户实体类
 * + @date 2019/3/7
 * + @E-mail 504391883@qq.com
 */
@Component
public class User implements Serializable {
    private  int id;
    private String username;
    private  String password;
    private String nickname;
    private String avatar;
    private long createtime ;
    private long updatetime;
    private int delflag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }

    public long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(long updatetime) {
        this.updatetime = updatetime;
    }

    public int getDelflag() {
        return delflag;
    }

    public void setDelflag(int delflag) {
        this.delflag = delflag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", delflag=" + delflag +
                '}';
    }
}
