package com.example.shiro.service;

import com.example.shiro.entity.UserInfo;

public interface UserInfoService {


    UserInfo findByUsername(String username);
}
