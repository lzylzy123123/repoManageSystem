package com.lly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lly.entity.User;
import com.lly.mapper.UserMapper;
import com.lly.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

  @Resource
  private UserMapper userMapper;
  
  @Override
  public List<User> listAll() {
    return userMapper.listAll();
  }

}
