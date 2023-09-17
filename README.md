# Amazon CodeWhisperer Spring App

Using Amazon CodeWhisperer to complete this spring web app.

## Step

1. Complete `com.amazonws.demo.product.config.DynamoDbEnhancedConfiguration.java`
1. Complete `com.amazonws.demo.product.dto.Product.java`
1. Complete `com.amazonws.demo.product.dao.entity.ProductDaoEntity.java`
1. Complete `com.amazonws.demo.product.dao.ProductDaoImpl.java`
1. Complete `com.amazonws.demo.product.service.ProductService.java`
1. Complete `com.amazonws.demo.product.controller.ProductController.java`

## Run and Test

- run `com.amazonws.demo.Main`

Now, we can request the following url, if you have successfully completed the above steps.

- create product

    ```bash
    curl --location 'http://localhost:8080/product/create' \
    --header 'Content-Type: application/json' \
    --data '{
      "id": "1",
      "name": "colo",
      "price": "3",
      "description": "Happy water",
      "rating": "S"
    }'
    ```

- get product

    ```bash
    curl --location 'http://localhost:8080/product/1' \
    --data ''
    ```
  
    Response
    
    ```json
    {
      "id": "1",
      "name": "colo",
      "price": "3",
      "description": "Happy water",
      "rating": "S"
    }
    ```