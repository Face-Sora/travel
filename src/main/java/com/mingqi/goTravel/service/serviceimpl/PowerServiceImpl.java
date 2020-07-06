package com.mingqi.goTravel.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingqi.goTravel.dao.PowerMapper;
import com.mingqi.goTravel.pojo.Power;
import com.mingqi.goTravel.service.PowerService;


@Service
public class PowerServiceImpl implements PowerService{

	@Autowired
	private PowerMapper pm;
	
	public List<Power> findAll() {
		return pm.selectByExample(null);
	}

	public void insert(Power power) {
		pm.insert(power);
	}

	public List<Power> findByRoleId(int roleId) {
		
	}

}
