package com.infodart.iepfa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.infodart.iepfa.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
}
