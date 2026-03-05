package com.camtien.example203.service;
import java.util.List;
import com.camtien.example203.entity.Category;

public interface CategoryService {
    Category createCategory(Category category);
    Category getCategoryById(Long categoryId);
    List<Category>  getAllCategorys();
    Category updateCategory(Category category);
    void deleteCategory(Long categoryId);
} 