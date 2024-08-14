package com.lly.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lly.entity.User;
import com.lly.service.UserService;

@SpringBootApplication
@RestController
public class HelloWorldController {
  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return String.format("Hello %s!", name);
  }

  @Autowired
  private UserService userService;

  @GetMapping("/list")
  public List<User> list(){
    return userService.listAll();
  }
}