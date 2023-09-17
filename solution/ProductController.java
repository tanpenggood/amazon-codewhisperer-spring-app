package com.amazonws.demo.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonws.demo.product.dto.Product;
import com.amazonws.demo.product.service.ProductService;

/**
 * create a RestController called ProductController to  create a product, get a product by id.
 * support cross-origin requests from all origins.
 */
@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {
    @Autowired
    private ProductService productService;

    //create a product
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    //get a product by id
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        return productService.getProductById(id);
    }

}