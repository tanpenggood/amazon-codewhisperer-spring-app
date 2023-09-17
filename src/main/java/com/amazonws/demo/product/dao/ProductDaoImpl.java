package com.amazonws.demo.product.dao;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.amazonws.demo.product.dao.entity.ProductDaoEntity;
import com.amazonws.demo.product.dto.Product;

import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;

@Slf4j
@Component
public class ProductDaoImpl {

    @Autowired
    private DynamoDbEnhancedClient enhancedClient;

    /**
     * Using @Value annotation to get PRODUCT_TABLE_NAME from product-table-name in the application.yml
     */


    /**
     * Create the DynamoDB table through enhancedClient object from ProductDaoEntity.
     * If the table already exists, log the error.
     */

    /**
     * Create the createProduct() method
     * Insert the ProductDaoEntity object into the DynamoDB table
     * Return the Product object
     *
     * @param productDaoEntity
     * @return product
     */

    /**
     * Get a particular ProductDaoEntity object from the DynamoDB table using the product id and return the ProductDaoEntity
     *
     * @param productId
     * @return productDaoEntity
     */

}
