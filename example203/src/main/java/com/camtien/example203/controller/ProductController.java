package com.camtien.example203.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.camtien.example203.entity.Product;
import com.camtien.example203.service.ProductService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/products")
public class ProductController {
    private ProductService productService;
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product Product){
        Product savedProduct = productService.createProduct(Product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Product> getProduct (@PathVariable("id")Long productId){
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> Products = productService.getAllProducts();
        return new ResponseEntity<>(Products,HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id")Long ProductId, @RequestBody Product product){
        product.setId(ProductId);
        Product updateProduct = productService.updateProduct(product);
        return new ResponseEntity<>(updateProduct, HttpStatus.OK);
    }
    @DeleteMapping({"id"})
    public ResponseEntity<String> deleteProduct(@PathVariable("id")Long ProductId){
        productService.deleteProduct(ProductId);
        return new ResponseEntity<>("Product successfully deleted!",HttpStatus.OK);
    }
}

