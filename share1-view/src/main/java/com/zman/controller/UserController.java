package com.zman.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zman.domain.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public String jsp(@RequestParam int type,Model model) {
		
		List<User> users = new ArrayList();
		users.add(new User(new Long(1),"zhangsan",20));
		users.add(new User(new Long(2),"zhangsan1",20));
		users.add(new User(new Long(3),"zhangsan2",20));
		model.addAttribute("users",users);
		if(type == 1) {
			return "userListjsp";
		} else{
			return "userListf";
		}
	}
}
