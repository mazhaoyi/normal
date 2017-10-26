package com.doordu.dao;

import java.util.List;

import com.doordu.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
	public List<UserEntity> list();

	public UserEntity getById(Integer userId);

	public int save(UserEntity user);

	public int update(UserEntity user);

	public int insertBatch(@Param("list") List<UserEntity> list);
}
