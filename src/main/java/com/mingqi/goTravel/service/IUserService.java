package com.mingqi.goTravel.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mingqi.goTravel.pojo.Role;
import com.mingqi.goTravel.pojo.Users;

public interface IUserService extends UserDetailsService{
		
	List<Users> findAllUser();
	
	void save(Users user);
	
	Users findById(int id);
}
