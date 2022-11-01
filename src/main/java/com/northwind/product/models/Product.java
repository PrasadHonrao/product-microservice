package com.northwind.product.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "products")
@Table(name ="products")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;
    @NotNull
    @Column(name = "product_name")
    @Length(max = 40)
    private String productName;
    @Column(name = "supplier_id")
    private Long supplierId;
    @Column(name = "category_id")
    private Long categoryId;
    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;
    @Column(name = "unit_price")
    private Float unitPrice;
    @Column(name = "units_in_stock")
    private Integer unitsInStock;
    @Column(name = "units_on_order")
    private Integer unitsOnOrder;
    @Column(name = "reorder_level")
    private Integer reorderLevel;
    @Column(name = "discontinued")
    private Integer discontinued;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(String productName, Float unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
    }
}
