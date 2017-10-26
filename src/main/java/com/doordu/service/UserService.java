package com.doordu.service;

import java.util.List;

import com.doordu.entity.UserEntity;

public interface UserService {
	public List<UserEntity> list();
	
	public UserEntity getById(Integer userId);
	
	public UserEntity save(UserEntity user);
	
	public UserEntity update(UserEntity user);

	public List<UserEntity> insertBatch(List<UserEntity> list);
}
