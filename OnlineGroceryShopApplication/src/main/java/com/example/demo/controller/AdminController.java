package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Product;
import com.example.demo.dto.User;
import com.example.demo.service.ProductServiceInt;
import com.example.demo.service.UserServiceInt;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	
	 @Autowired
	 ProductServiceInt productService;
	 
	 
	 @Autowired
	 UserServiceInt userService;

	@PostMapping("/addproduct")
    public Product create(@RequestBody Product product) {

		productService.save(product);
		
		
        return product;
       
    }
	
	@GetMapping(path="/viewproducts")
	 public  ResponseEntity<List<Product>> showAll() {
		  
		List<Product> list = productService.findAll();	  
	     return new ResponseEntity<List<Product>>(list, HttpStatus.OK); 
	      
	  }


	@DeleteMapping("/deleteproduct/{id}")
	    public ResponseEntity<String> deleteit(@PathVariable("id") Long productId) {
	        productService.delete(productId);
	        return ResponseEntity.ok("Deleted Successfully");
	    }

	@PutMapping("/updateproduct")
    public ResponseEntity<String> update(@RequestBody Product product) {
		productService.save(product);
        return ResponseEntity.ok("Updated Successfully");
    }
	@PostMapping("/adduser")
    public User createUser(@RequestBody User user) {

		userService.save(user);
		
		
        return user;
       
    }
	@GetMapping(path="/viewusers")
	 public  ResponseEntity<List<User>> showAllUsers() {
		  
		List<User> list = userService.findAll();	  
	     return new ResponseEntity<List<User>>(list, HttpStatus.OK); 
	      
	  }

	
	
}
