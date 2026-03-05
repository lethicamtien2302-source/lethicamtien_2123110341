package com.camtien.example201.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camtien.example201.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
} 
    

