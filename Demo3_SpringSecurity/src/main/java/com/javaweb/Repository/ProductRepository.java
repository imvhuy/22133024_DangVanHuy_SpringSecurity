package com.javaweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
