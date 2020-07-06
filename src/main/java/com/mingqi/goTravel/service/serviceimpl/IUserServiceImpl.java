package com.mingqi.goTravel.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mingqi.goTravel.dao.UserMapper;
import com.mingqi.goTravel.pojo.Role;
import com.mingqi.goTravel.pojo.Users;
import com.mingqi.goTravel.service.IUserService;


@Service("iuserservice")
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper ump;
	
	@Autowired
	private BCryptPasswordEncoder bcpe;

	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		Users myUser = ump.findByName(name);
		System.out.println(myUser);
		if(myUser == null) {
			return null;
		}
		
		List<SimpleGrantedAuthority> authorities = new ArrayList();
		
		List<Role> roles = myUser.getRoles();
		
		if (roles == null) {
			return null;
		}
		
		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getRolename()));
		}
		
		User user = new User(myUser.getUsername(),myUser.getPassword(),authorities);
		System.out.println(user);
		
		// TODO Auto-generated method stub
		return user;
	}

	public List<Users> findAllUser() {
		return ump.findAll();
	}

	public void save(Users user) {
		user.setPassword(bcpe.encode(user.getPassword()));
		ump.insert(user);
	}

	public Users findById(int id) {
		return ump.findById(id);
	}

	public void bindRole(int id, int userId) {
		ump.bindRole(id,userId);
	}
	}

