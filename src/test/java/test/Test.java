package test;

import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Test {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3);
		String strs = "[1, 2, 3]";
		List<Integer> list = JSON.parseArray(strs, Integer.class);
		System.out.println(list);
	}
}
