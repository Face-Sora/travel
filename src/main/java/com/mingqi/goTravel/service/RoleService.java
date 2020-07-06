package com.mingqi.goTravel.service;

import java.util.List;

import com.mingqi.goTravel.pojo.Role;

public interface RoleService {

	List<Role> findAll();
	
	Role findById(int id);
	
	void insert(Role role);
	
	List<Role> findElseById(int id);
	
	void bindPower(int roleId, int powerId);
}
