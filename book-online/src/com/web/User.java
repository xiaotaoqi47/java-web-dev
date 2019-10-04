package com.web;

import java.time.LocalDate;

/**
 * @author xiaotaoqi
 * @ClassName admin
 * @Description 用户资料
 * @Date 2019/10/3
 * @Version 1.0
 **/

public class User {
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private String gender;
    private String avatar;
    private LocalDate joinDate;

    public User(Integer id, String account, String password, String nickname, String gender, String avatar, LocalDate joinDate) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.gender = gender;
        this.avatar = avatar;
        this.joinDate = joinDate;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", avatar='" + avatar + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
