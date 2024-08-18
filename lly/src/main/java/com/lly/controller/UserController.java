package com.lly.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.lly.entity.User;
import com.lly.service.UserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lly
 * @since 2024-08-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/list")
  public List<User>list(){
    return userService.list();
  }
}
