package com.mingqi.goTravel.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mingqi.goTravel.pojo.Order;
import com.mingqi.goTravel.pojo.Product;
import com.mingqi.goTravel.service.ProductService;
import com.mingqi.goTravel.service.serviceimpl.OrderServiceImpl;
import com.mingqi.goTravel.service.serviceimpl.ProductServiceImpl;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl ps;
	
	@RequestMapping("show_all")
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("productlist", ps.selectAll());
		mv.setViewName("productlist");
		return mv;
	}
	
	@RequestMapping("save")
	public String save(Product product) throws ParseException
	{
		ps.add(product);
		return "redirect:show_all";
	}
	
}
