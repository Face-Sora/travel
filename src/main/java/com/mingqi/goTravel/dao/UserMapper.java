package com.mingqi.goTravel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingqi.goTravel.pojo.Role;
import com.mingqi.goTravel.pojo.Users;

public interface UserMapper {
	
	Users findByName(String name);
	
	List<Users> findAll();

	void insert(Users user);

	Users findById(int id);

	void bindRole(int id, int userId);

}
