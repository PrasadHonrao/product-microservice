package com.northwind.product.services;


import com.northwind.product.models.Product;
import com.northwind.product.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> list() {
        return productRepository.findAll();
    }

    public Product get(Integer productId) {
        return productRepository.findByProductId(productId);
    }

    public List<Product> get(String productName) {
        return productRepository.findByProductName(productName);
    }

    public Product create(Product product) {
        // flush will actually store it in DB...only save will save it in local context
        return productRepository.saveAndFlush(product);
    }

    public void delete(Integer productId) {
        productRepository.deleteById(productId);
    }



    public Product update(Product product) {
        return productRepository.saveAndFlush(product);
    }
}
