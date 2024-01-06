package com.yk.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yk.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    

}
