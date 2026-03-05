package com.camtien.example203.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.camtien.example203.entity.Category;
import com.camtien.example203.service.CategoryService;
import com.camtien.example203.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long categoryId) {
        Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
        return optionalCategory.get();
    }

    @Override
    public List<Category> getAllCategorys(){
        return categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(Category category){
        Category existingCategory = categoryRepository.findById(category.getId()).get();
        existingCategory.setTitle(category.getTitle());
        existingCategory.setDescription(category.getDescription());
        existingCategory.setPhoto(category.getPhoto());
        existingCategory.setProducts(category.getProducts());
        Category updatedCategory = categoryRepository.save(existingCategory);
        return updatedCategory;
    }

    @Override
    public void deleteCategory(Long categoryId){
        categoryRepository.deleteById(categoryId);
    }
}
