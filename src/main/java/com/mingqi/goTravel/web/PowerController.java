package com.mingqi.goTravel.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mingqi.goTravel.pojo.Power;
import com.mingqi.goTravel.service.serviceimpl.PowerServiceImpl;
import com.mingqi.goTravel.service.serviceimpl.RoleServiceImpl;

@Controller
@RequestMapping("power")
public class PowerController {

	
	@Autowired
	private PowerServiceImpl psi;
	
	@Autowired
	private RoleServiceImpl rsi;
	
	@RequestMapping("show_all")
	public ModelAndView showAll() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("power_list");
		mv.addObject("powers", psi.findAll());
		return mv;
	}
	
	@RequestMapping("save")
	public String save(Power power) {
		psi.insert(power);
		return "redirect:show_all";
	}
	
	@RequestMapping("findElse")
	public ModelAndView findElse(int roleId){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("role_power_add");
			List<Power> all = psi.findAll();
			List<Power> part = rsi.findById(roleId).getPowers();
			System.out.println(part);
			all.removeAll(part);
			System.out.println(all);
			mv.addObject("powers", all);
			mv.addObject("roleId", roleId);
			return mv;
	}
	}
