package com.amazonws.demo.product.dao.entity;

import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * create a dynamo db ProductDaoEntity class with partition Key as id, name, price, description, rating attributes using dynamo db enhanced mapper annotations.
 */
