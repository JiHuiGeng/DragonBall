package com.cloudinary.dragonball.controller.user;

import com.cloudinary.dragonball.entity.User;
import com.cloudinary.dragonball.request.UserRequest;
import com.cloudinary.dragonball.service.user.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息控制类
 *
 * @Author: gengjihui
 * @Date: 2024/5/17 15:52
 * @Description:
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserInfoService userInfoService;

  @PostMapping("/getUserInfo")
  public User getUserInfo(@RequestBody UserRequest user) {
    return userInfoService.getUserInfo(user);
  }
}
