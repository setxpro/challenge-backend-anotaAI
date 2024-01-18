package com.patrickanjos.desafioanotaai.domain.product;

import com.patrickanjos.desafioanotaai.domain.category.Category;

public record ProductDTO(String title, String description, String ownerId, Integer price, String categoryId) {
}
