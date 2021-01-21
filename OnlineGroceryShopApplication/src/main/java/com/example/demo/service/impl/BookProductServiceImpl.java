package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookProductDAO;
import com.example.demo.dto.BookProduct;
import com.example.demo.service.BookProductServiceInt;
@Service
public class BookProductServiceImpl implements BookProductServiceInt {

	
	@Autowired
    BookProductDAO bookProductDao;
	
	
	@Override
	public void save(BookProduct bookinginfo) {
		bookProductDao.save(bookinginfo);
	}

}
