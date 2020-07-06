package com.mingqi.goTravel.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mingqi.goTravel.pojo.Users;
import com.mingqi.goTravel.service.serviceimpl.IUserServiceImpl;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserServiceImpl usi;
	
	@RequestMapping("show_all")
	public ModelAndView showAll() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userList");
		 List<Users> users = usi.findAllUser();
		 System.out.println(users);
		mv.addObject("userList",users);
		return mv;
	}
	
	@RequestMapping("save")
	public String save(Users user) {
		usi.save(user);
		return "redirect:show_all";
	}
	
	@RequestMapping("message")
	public ModelAndView findById(int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user_message");
		Users user = usi.findById(id);
		System.out.println(user);
		mv.addObject("user",user);
		return mv;
	}
	
	@RequestMapping("bindRole")
	public String bindRole(int id, int userId) {
		usi.bindRole(id,userId);
		return "redirect:show_all";
	}
}
