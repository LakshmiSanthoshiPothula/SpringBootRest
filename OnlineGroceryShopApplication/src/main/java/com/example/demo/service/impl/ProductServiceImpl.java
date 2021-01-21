package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dto.Product;
import com.example.demo.service.ProductServiceInt;

@Service
public class ProductServiceImpl implements ProductServiceInt{
	
	 @Autowired
	    ProductDAO productDao;

   @Override
	public  List<Product> findAll()  {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}


	@Override
	public Optional<Product> findByProductId(Long productId) {
		// TODO Auto-generated method stub
		return productDao.findById(productId);
	}


	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return productDao.findByName(name);
	}

	@Override
	public void save(Product product) {
		productDao.save(product);
		
	}
	
	@Override
	public void delete(Long productId) {
		productDao.deleteById(productId);
		
	}

	
	}


