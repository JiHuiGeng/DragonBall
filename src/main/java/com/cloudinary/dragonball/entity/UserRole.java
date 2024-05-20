package com.cloudinary.dragonball.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户角色
 *
 * @Author: gengjihui
 * @Date: 2024/5/17 15:47
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRole extends BasicEntity {
  private String id;
  private String role;
}
