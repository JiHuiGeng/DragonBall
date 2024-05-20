package com.cloudinary.dragonball.service.user.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudinary.dragonball.entity.User;
import com.cloudinary.dragonball.mapper.UserInfoMapper;
import com.cloudinary.dragonball.request.UserRequest;
import com.cloudinary.dragonball.service.user.UserInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author: gengjihui
 * @Date: 2024/5/17 16:00
 * @Description:
 */
@Service
@AllArgsConstructor
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, User> implements UserInfoService {

  /**
   * getUserInfo
   *
   * @param user user
   * @return UserInfo
   * @date 2024/5/17 16:00
   * @author gengjihui
   */
  @Override
  public User getUserInfo(UserRequest user) {
    return this.getOne(Wrappers.<User>query().lambda().eq(User::getUsername, user.getUsername()));
  }

}
