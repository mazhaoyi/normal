package com.doordu.controller;

import java.util.List;

import com.alibaba.fastjson.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.doordu.controller.vo.UserVo;
import com.doordu.entity.UserEntity;
import com.doordu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	@ResponseBody
	public Object list() {
		List<UserEntity> list = userService.list();
		return list;
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public UserEntity get(Integer userId) {
		logger.info("userId = {}", userId);
		return userService.getById(userId);
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public UserEntity save(UserVo user) {
		String userJson = JSON.toJSONString(user);
		logger.info(userJson);
		UserEntity ue = JSON.parseObject(userJson, UserEntity.class);
		return userService.save(ue);
	}

	@RequestMapping("/saveBatch")
	@ResponseBody
	public Object saveBatch(@RequestBody List<UserVo> users) {
		String userJson = JSON.toJSONString(users);
		logger.info(userJson);
		List<UserEntity> entitys = JSON.parseObject(userJson, new TypeReference<List<UserEntity>>(){});
		return userService.insertBatch(entitys);
	}
}
