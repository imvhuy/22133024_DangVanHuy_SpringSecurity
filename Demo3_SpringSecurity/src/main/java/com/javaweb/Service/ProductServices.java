package com.javaweb.Service;

import java.util.List;

import com.javaweb.entity.Product;

public interface ProductServices {
	void delete(Long id);
	Product get(Long id);
	Product save(Product product);
	List<Product> listAll();
} 
