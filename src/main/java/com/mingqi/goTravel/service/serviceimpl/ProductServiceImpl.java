package com.mingqi.goTravel.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingqi.goTravel.dao.ProductMapper;
import com.mingqi.goTravel.pojo.Product;
import com.mingqi.goTravel.pojo.ProductExample;
import com.mingqi.goTravel.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductMapper pd;
	
	public List<Product> selectAll(){
		return pd.selectByExample(null);
	}

	public int add(Product pro) {
		// TODO Auto-generated method stub
		return pd.insert(pro);
	}
	
	
}
