package cn.it.dubbox.demon.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.it.dubbox.demon.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	public String getName() {
		// TODO Auto-generated method stub
		return "dubbox";
	}
	
}
