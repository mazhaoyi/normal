package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.doordu.controller.vo.UserVo;

public class Test {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3);
//		String strs = "[1, 2, 3]";
//		List<Integer> list = JSON.parseArray(strs, Integer.class);
//		System.out.println(list);
		List<UserVo> users = new ArrayList<>(1);
		UserVo uv = new UserVo();
		uv.setAge(2);
		uv.setBirthday(Calendar.getInstance().getTime());
		uv.setProperties(null);
		uv.setName("王五");
		uv.setIsValid(true);
		uv.setCreateTime(Calendar.getInstance().getTime());
		users.add(uv);
		System.out.println(JSON.toJSONString(users));
	}
}
