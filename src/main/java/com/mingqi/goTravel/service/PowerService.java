package com.mingqi.goTravel.service;

import java.util.List;

import com.mingqi.goTravel.pojo.Power;

public interface PowerService {

	List<Power> findAll();
	
	void insert(Power power);
}
