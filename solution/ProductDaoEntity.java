package com.amazonws.demo.product.dao.entity;

import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * create a dynamo db ProductDaoEntity class with partition Key as id, name, price, description, rating attributes using dynamo db enhanced mapper annotations.
 */
@Data
@DynamoDbBean
public class ProductDaoEntity {
    private String id;
    private String name;
    private String price;
    private String description;
    private String rating;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("id")
    public String getId() {
        return id;
    }

    @DynamoDbAttribute("name")
    public String getName() {
        return name;
    }

    @DynamoDbAttribute("price")
    public String getPrice() {
        return price;
    }

    @DynamoDbAttribute("description")
    public String getDescription() {
        return description;
    }

    @DynamoDbAttribute("rating")
    public String getRating() {
        return rating;
    }
}