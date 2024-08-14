package com.lly.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("user")
public class User {
  private int id;
  private String no;
  private String name;
  private String password;
  private int age;
  private int sex;
  private String phone;
  private int roleId;
  private String isvalid;
}
