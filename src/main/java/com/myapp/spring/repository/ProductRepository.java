package com.myapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.spring.model.Product;
import java.util.List;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product,Integer> {
	Optional<List<Product>> findByProductNameIgnoreCase(String productName);
	

}
