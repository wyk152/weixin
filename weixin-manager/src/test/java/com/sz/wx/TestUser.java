package com.sz.wx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sz.pc.User;
import com.sz.wx.mapper.UserMapper;

public class TestUser {

	@Test
	public void TestMybatis(){
		
		//创建一个spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		User user = new User();
		user = userMapper.selectById(1L);
		System.out.println(user);
	}
}
