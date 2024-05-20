package com.cloudinary.dragonball.service.user;

import com.cloudinary.dragonball.entity.User;
import com.cloudinary.dragonball.request.UserRequest;

/**
 * @Author: gengjihui
 * @Date: 2024/5/17 15:54
 * @Description:
 */
public interface UserInfoService {
  User getUserInfo(UserRequest user);
}
