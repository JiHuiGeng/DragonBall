package com.cloudinary.dragonball.entity;

import lombok.Data;

/**
 * 基类
 *
 * @Author: gengjihui
 * @Date: 2024/5/17 15:48
 * @Description:
 */
@Data
public class BasicEntity {
  private Data createTime;
  private Data updateTime;
  private String createBy;
  private String updateBy;
  private String deleteFlag;
}
