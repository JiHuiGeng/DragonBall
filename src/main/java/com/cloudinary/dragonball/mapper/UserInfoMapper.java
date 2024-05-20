package com.cloudinary.dragonball.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloudinary.dragonball.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: gengjihui
 * @Date: 2024/5/17 16:12
 * @Description:
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<User> {
}
