package com.lly.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lly.entity.User;

@Service
public interface UserService extends IService<User>{

  List<User> listAll();
  
}
