package com.northwind.product.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomProductRepositoryImpl implements CustomProductRepository {

    @PersistenceContext
    @Autowired
    EntityManager entityManager;

    @Override
    public List<String> getCustomProducts() {
        return entityManager.createQuery("select p.productName from products p").getResultList();
    }
}
