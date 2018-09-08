package com.company.repositories;

import com.company.data.Product;
import com.mongodb.Mongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product, Long> {

}
