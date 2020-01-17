package com.example.main;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("select * from t_user")
	List<User> getAllUser();

	@Select("select * from t_user where pk_user_id=#{pk_user_id}")
	User getUserById(int id);
}
