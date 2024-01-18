package com.patrickanjos.desafioanotaai.repositories;

import com.patrickanjos.desafioanotaai.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
