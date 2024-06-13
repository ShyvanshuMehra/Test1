package com.infodart.iepfa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infodart.iepfa.service.UserService;
import com.infodart.iepfa.service.impl.dao.UserServiceImplDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserServiceImplDao userServiceImplDao;
	
	@Override
	public Integer checkUser(String mobileNo) {
		return userServiceImplDao.checkUser(mobileNo);
	}

}
