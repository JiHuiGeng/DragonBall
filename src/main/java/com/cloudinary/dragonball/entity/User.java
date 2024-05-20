package com.cloudinary.dragonball.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户
 *
 * @Author: gengjihui
 * @Date: 2024/5/17 15:46
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BasicEntity {
  private String id;
  private String username;
  private String password;
  private String email;
  private String firstName;
  private String lastName;
  private String phone;
  private String age;
  private String gender;
  private String birthday;
  private String roleId;
}
