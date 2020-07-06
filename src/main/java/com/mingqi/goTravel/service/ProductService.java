package com.mingqi.goTravel.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mingqi.goTravel.pojo.Product;


@Service	
public interface ProductService {
	public List<Product> selectAll();
	
	public int add(Product pro);
}
