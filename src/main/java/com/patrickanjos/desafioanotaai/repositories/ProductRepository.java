package com.patrickanjos.desafioanotaai.repositories;

import com.patrickanjos.desafioanotaai.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
