package com.mingqi.goTravel.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.mingqi.goTravel.dao.RoleMapper;
import com.mingqi.goTravel.pojo.Role;
import com.mingqi.goTravel.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleMapper rm;
	
	public List<Role> findAll() {
		return rm.selectByExample(null);
	}

	public Role findById(int id) {
		return rm.selectByPrimaryKey(id);
	}

	public void insert(Role role) {
		rm.insert(role);
	}

	public List<Role> findElseById(int id) {
		return rm.findElseById(id);
	}

	public void bindPower(int roleId, int powerId) {
		rm.bindPower(roleId,powerId);
	}

}
