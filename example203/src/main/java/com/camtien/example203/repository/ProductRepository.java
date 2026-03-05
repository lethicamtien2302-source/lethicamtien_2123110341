package com.camtien.example203.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camtien.example203.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
} 
