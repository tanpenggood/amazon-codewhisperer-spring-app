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

    /**
     * using @Value annotation to get PRODUCT_TABLE_NAME from the application.yml
     */
    @Value("${product-table-name}")
    private String PRODUCT_TABLE_NAME;

    @Autowired
    private DynamoDbEnhancedClient enhancedClient;

    /**
     * Create the DynamoDB table through enhancedClient object from ProductDaoEntity.
     * If the table already exists, log the error.
     */
    @PostConstruct
    public void createTable() {
        try {
            DynamoDbTable<ProductDaoEntity> productTable = enhancedClient.table(PRODUCT_TABLE_NAME, TableSchema.fromBean(ProductDaoEntity.class));
            productTable.createTable();
            log.info("create table success!");
        } catch (Exception e) {
            log.error("Error creating table: " + e.getMessage());
        }
    }

    /**
     * Create the createProduct() method
     * Insert the ProductDaoEntity object into the DynamoDB table
     * Return the Product object
     *
     * @param productDaoEntity
     * @return product
     */
    public Product createProduct(ProductDaoEntity productDaoEntity) {
        DynamoDbTable<ProductDaoEntity> productTable = enhancedClient.table(PRODUCT_TABLE_NAME, TableSchema.fromBean(ProductDaoEntity.class));
        productTable.putItem(productDaoEntity);
        Product product = new Product();
        BeanUtils.copyProperties(productDaoEntity, product);
        return product;
    }

    /**
     * Get a particular ProductDaoEntity object from the DynamoDB table using the product id and return the ProductDaoEntity
     *
     * @param productId
     * @return productDaoEntity
     */
    public ProductDaoEntity getProduct(String productId) {
        DynamoDbTable<ProductDaoEntity> productTable = enhancedClient.table(PRODUCT_TABLE_NAME, TableSchema.fromBean(ProductDaoEntity.class));
        Key key = Key.builder().partitionValue(productId).build();
        ProductDaoEntity productDaoEntity = productTable.getItem(key);
        return productDaoEntity;
    }

}
