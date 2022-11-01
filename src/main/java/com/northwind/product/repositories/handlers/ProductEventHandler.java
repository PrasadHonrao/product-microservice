package com.northwind.product.repositories.handlers;

import com.northwind.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class ProductEventHandler {

    @Autowired
    ProductRepository productRepository;

//    @HandleBeforeCreate
//    public void handleProductCreate(Product p) {
//        Product existingProduct = productRepository.findFirstByProductName(p.getProductName());
//        if (existingProduct != null) {
//            System.out.println("Product name needs to be unique");
//            throw new ConstraintViolationException("Product name needs to be unique", new HashSet<>());
//        }
//    }
}
