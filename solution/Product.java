package com.amazonws.demo.product.dto;

import lombok.Data;

/**
 * create a Product class with id, name, price, description and rating properties.
 */
@Data
public class Product {
    private String id;
    private String name;
    private String price;
    private String description;
    private String rating;
}