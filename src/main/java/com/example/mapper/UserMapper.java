package com.example.mapper;

import com.example.bean.AppUser;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("SELECT user_id as userId, user_kind as userKind, user_status as userStatus FROM t_app_user WHERE user_id = #{userId}")
    AppUser findByUserId(@Param("userId") String userId);

}