package com.mars.microservices.productservice.repository;

import com.mars.microservices.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
