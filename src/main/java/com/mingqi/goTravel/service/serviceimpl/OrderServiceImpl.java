package com.mingqi.goTravel.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingqi.goTravel.dao.OrderMapper;
import com.mingqi.goTravel.pojo.Order;
import com.mingqi.goTravel.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderMapper om;
	
	public List<Order> selectAll() {
		
		return om.selectByExample(null);
	}
	
	public Order selectByPrimaryKey(int id) {
		return om.selectByPrimaryKey(id);
	}

}
