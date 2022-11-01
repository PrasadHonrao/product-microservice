package com.northwind.product.repositories;

import com.northwind.product.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>, CustomProductRepository {
    Product findByProductId(Integer productId);

//    // Derived queries
      List<Product> findByProductName(String productName);
//    List<Product> findByProductNameContains(String productName);
//    List<Product> findBySupplierId(Long supplierId);
//    List<Product> findBySupplierIdNot(Long supplierId);
//    List<Product> findByCategoryId(Long categoryId);
//    List<Product> findByDiscontinuedTrue();
//    List<Product> findByDiscontinuedFalse();
//    List<Product> findByProductNameAndDiscontinued(String productName, boolean isDiscontinued);
//    List<Product> findBySupplierIdOrCategoryId(Long supplierId, Long categoryId);
//    Product findFirstByProductNameContains(String productName);
//    Product findFirstByProductNameContainsIgnoreCase(String productName);
//    void deleteByProductName(String productName);
//    Long countByProductNameContainsIgnoreCase(String productName);
//
//    @Query("SELECT p from Product p where p.discontinued = true and p.unitPrice < ?1 ")
//    List<Product> findDiscontinuedProductWhichAreLessThanUnitPrice(Float unitPrice);
//
//    // Paging
//    Page<Product> findAllByCategoryId(Long categoryId, Pageable page);
//
//    Product findFirstByProductName(String productName);

    /*
    Other possible methods
    List<Product> findByProductNameLike(String productName)  // remember to add % in the product name parameter
    List<Product> findByProductNameNotLike(String productName) // remember to add % in the product name parameter
    List<Product> findByProductNameStartingWith(String productName) // no need to add % symbol
    List<Product> findByProductNameEndingWith(String productName) // no need to add % symbol
    List<Product> findByProductNameContaining(String productName) // same as contains

    List<Product> findByUnitPriceLessThan(Float unitPrice)
    List<Product> findByUnitPriceLessThanEqual(Float unitPrice)
    List<Product> findByUnitPriceGreaterThan(Float unitPrice)
    List<Product> findByUnitPriceGreaterThanEqual(Float unitPrice)

    List<Product> findByProductNameIsNull(String productName)
    List<Product> findByProductNameIsNotNull(String productName)

    List<Product> findByCategoryIdIn(List<Long> categoryIds)
    List<Product> findByCategoryIdNotIn(List<Long> categoryIds)

    List<Product> findBySupplierIdOrderByUnitPriceAsc(Long supplierId)
    List<Product> findBySupplierIdOrderByUnitPriceDesc(Long supplierId)


    List<Product> findTop5BySupplierId(Long supplierId)
    List<Product> findDistinctBySupplierId(Long supplierId)


    * */
}
