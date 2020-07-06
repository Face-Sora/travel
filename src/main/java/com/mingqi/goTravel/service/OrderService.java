package com.mingqi.goTravel.service;

import java.util.List;

import com.mingqi.goTravel.pojo.Order;

public interface OrderService {
	
	List<Order> selectAll();
	
	Order selectByPrimaryKey(int id);
}
