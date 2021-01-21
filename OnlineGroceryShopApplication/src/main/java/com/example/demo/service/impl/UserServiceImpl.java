package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDAO;
import com.example.demo.dto.User;
import com.example.demo.service.UserServiceInt;
@Service
public class UserServiceImpl implements UserServiceInt {
	
@Autowired	
UserDAO userDao;


	@Override
	public void save(User user) {
	
	
	userDao.save(user);
	
		
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
