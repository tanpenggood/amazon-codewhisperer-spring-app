package com.amazonws.demo.product.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;

@Slf4j
@Configuration
public class DynamoDbEnhancedConfiguration {

    @Bean
    public DynamoDbEnhancedClient getDynamoDBClient() {
        log.info("Creating DynamoDbEnhancedClient");
        return DynamoDbEnhancedClient.create();
    }

}
