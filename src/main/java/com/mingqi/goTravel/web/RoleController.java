package com.mingqi.goTravel.web;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mingqi.goTravel.pojo.Role;
import com.mingqi.goTravel.service.serviceimpl.RoleServiceImpl;

@Controller
@RequestMapping("role")
public class RoleController {

	
	@Autowired
	private RoleServiceImpl rsi;
	
	@RequestMapping("show_all")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ModelAndView showAll() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("role_list");
		mv.addObject("roles", rsi.findAll());
		return mv;
	}
	
	@RequestMapping("message")
	public ModelAndView findById(int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("role_message");
		mv.addObject("role",rsi.findById(id));
		return mv;
	}
	
	@RequestMapping("save")
	public String save(Role role) {
		rsi.insert(role);
		return "redirect:show_all";
	}
	
	@RequestMapping("findElse")
	public ModelAndView findElse(int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user_add_role");
		List<Role> others = rsi.findElseById(id);
		System.out.println(others);
		mv.addObject("roles", others);
		mv.addObject("userId", id);
		return mv;
	}
	
	@RequestMapping("bindPower")
	public String bindPower(int roleId, int powerId) {
		rsi.bindPower(roleId,powerId);
		return "redirect:show_all";
	}
}
