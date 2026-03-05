package com.camtien.example203.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camtien.example203.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
   
} 
