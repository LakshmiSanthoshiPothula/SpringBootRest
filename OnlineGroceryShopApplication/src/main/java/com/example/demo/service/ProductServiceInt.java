package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.Product;

public interface ProductServiceInt {

	
	void save(Product product);
	
    List<Product> findAll();
    
    Optional<Product> findByProductId(Long productId);
    
    List<Product> findByName(String name);
    
    void delete(Long productId);
    

}
