package com.example.demo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookProduct;
import com.example.demo.dto.Product;
import com.example.demo.service.BookProductServiceInt;
import com.example.demo.service.ProductServiceInt;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	
	  @Autowired
	    ProductServiceInt productService;
	  @Autowired
      BookProductServiceInt bookproduct;
	  
	
	@GetMapping(path="/viewproducts")
	 public  ResponseEntity<List<Product>> showAll() {
		  
		List<Product> list = productService.findAll();	  
	     return new ResponseEntity<List<Product>>(list, HttpStatus.OK); 
	      
	  }

    @GetMapping("/productid/{id}")
    public Optional<Product> showOne(@PathVariable("id") Long productId) {

        


        return productService.findByProductId(productId);
    }
 
    @GetMapping("/productname/{name}")
    public  ResponseEntity<List<Product>>  showName(@PathVariable("name") String name) {

        
    	List<Product> list=productService.findByName(name);

        return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
    }
  
	 
    @PostMapping("/placeorder")
    public BookProduct create(@RequestBody BookProduct bookinginfo) {

		bookproduct.save(bookinginfo);
		
		
        return bookinginfo;
       
    }
    
}
