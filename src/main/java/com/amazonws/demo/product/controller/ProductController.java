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
 * create a RestController called ProductController withs methods:
 * createProduct(Product product), getProducts(String id).
 * support cross-origin requests from all origins.
 */