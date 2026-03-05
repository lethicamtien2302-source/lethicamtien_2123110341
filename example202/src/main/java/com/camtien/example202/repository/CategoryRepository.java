package com.camtien.example202.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camtien.example202.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
   
} 