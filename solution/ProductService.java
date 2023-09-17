package com.amazonws.demo.product.service;

import com.amazonws.demo.product.dao.entity.ProductDaoEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonws.demo.product.dto.Product;
import com.amazonws.demo.product.dao.ProductDaoImpl;

/**
 * Create a class called ProductService with methods:
 * getProductById(string id), createProduct(ProductDaoEntity productDaoEntity)
 */
@Service
public class ProductService {

    @Autowired
    private ProductDaoImpl productDao;

    public Product getProductById(String id) {
        ProductDaoEntity productDaoEntity = productDao.getProduct(id);
        Product product = new Product();
        BeanUtils.copyProperties(productDaoEntity, product);
        return product;
    }

    public Product createProduct(Product product) {
        ProductDaoEntity productDaoEntity = new ProductDaoEntity();
        BeanUtils.copyProperties(product, productDaoEntity);
        return productDao.createProduct(productDaoEntity);
    }

}