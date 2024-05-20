package com.cloudinary.dragonball.request;

import lombok.Data;

/**
 * @Author: gengjihui
 * @Date: 2024/5/17 16:20
 * @Description:
 */
@Data
public class UserRequest {
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
