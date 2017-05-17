package com.sz.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sz.pc.User;
import com.sz.wx.mapper.UserMapper;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired UserMapper userMapper;
	@RequestMapping("/select")
	@ResponseBody
	public User insertContent() {
		User result = userMapper.selectById(1L);
		return result;
	}
}
