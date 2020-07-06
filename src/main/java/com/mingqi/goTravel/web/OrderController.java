package com.mingqi.goTravel.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mingqi.goTravel.pojo.Order;
import com.mingqi.goTravel.service.serviceimpl.OrderServiceImpl;

@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private OrderServiceImpl os;
	
	@RequestMapping("show_all_order")
	public ModelAndView showAllOrder(@RequestParam("pn") int pn,@RequestParam(value="size",defaultValue="3") int size) {
		PageHelper.startPage(pn, size);
		List<Order> all = os.selectAll();
		PageInfo pi = new PageInfo(all,3);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("orderList");
		mv.addObject("allOrder",pi);
		return mv;
	}
	
	@RequestMapping("message")
	public ModelAndView message(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("all-order-manage-edit");
		Order order = os.selectByPrimaryKey(id);
		System.out.println(order);
		mv.addObject("order", order);
		return mv;
	}
}
