package com.example.shiro.service.impl;

import com.example.shiro.dao.UserInfoDao;
import com.example.shiro.entity.UserInfo;
import com.example.shiro.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;


    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }
}
