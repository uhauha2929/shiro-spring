package com.example.shiro.dao;

import com.example.shiro.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserInfoDao extends JpaRepository<UserInfo, Long> {


    UserInfo findByUsername(String username);

}
