package com.camtien.example203.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.camtien.example203.entity.Product;
import com.camtien.example203.service.ProductService;
import com.camtien.example203.repository.ProductRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }
    @Override
    public Product getProductById(Long productId){
        Optional<Product> optionalProduct =  productRepository.findById(productId);
        return optionalProduct.get();
    }
    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    @Override
    public Product updateProduct(Product product){
        Product exitstingProduct = productRepository.findById(product.getId()).get();
        exitstingProduct.setTitle(product.getTitle());
        exitstingProduct.setDescription(product.getDescription());
        exitstingProduct.setPhoto(product.getPhoto());
        exitstingProduct.setPrice(product.getPrice());
        exitstingProduct.setCategory(product.getCategory());
        Product updateProduct = productRepository.save(exitstingProduct);
        return updateProduct;
    }
    @Override
    public void deleteProduct(Long productId){
        productRepository.deleteById(productId);
    }
}

