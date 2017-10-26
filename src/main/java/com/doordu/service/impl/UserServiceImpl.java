package com.doordu.service.impl;

import java.util.List;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doordu.dao.UserDao;
import com.doordu.entity.UserEntity;
import com.doordu.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public List<UserEntity> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

	public UserEntity getById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.getById(userId);
	}

	public UserEntity save(UserEntity user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return user;
	}

	public UserEntity update(UserEntity user) {
		// TODO Auto-generated method stub
		userDao.update(user);
		return user;
	}

	@Override
	public List<UserEntity> insertBatch(List<UserEntity> list) {
		int res = userDao.insertBatch(list);
//		System.out.println(1/0);
		System.out.println(JSON.toJSONString(list));
		return list;
	}

}
