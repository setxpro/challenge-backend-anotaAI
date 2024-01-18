package com.patrickanjos.desafioanotaai.services;

import com.patrickanjos.desafioanotaai.domain.category.Category;
import com.patrickanjos.desafioanotaai.domain.category.exceptions.CategoryNotFoundException;
import com.patrickanjos.desafioanotaai.domain.product.Product;
import com.patrickanjos.desafioanotaai.domain.product.ProductDTO;
import com.patrickanjos.desafioanotaai.domain.product.exceptions.ProductNotFoundException;
import com.patrickanjos.desafioanotaai.repositories.CategoryRepository;
import com.patrickanjos.desafioanotaai.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoryService categoryService;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
    }


    public Product insert(ProductDTO productData) {

        Category category = this.categoryService.getById(productData.categoryId())
                .orElseThrow(CategoryNotFoundException::new);

        Product newProduct = new Product(productData);

        newProduct.setCategory(category);

        this.productRepository.save(newProduct);

        return newProduct;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product update(String id, ProductDTO productData) {
        Product product = this.productRepository.findById(id)
                .orElseThrow(ProductNotFoundException::new);

        if (productData.categoryId() != null) {
            // Verify if the category exists
            this.categoryService.getById(productData.categoryId())
                    .ifPresent(product::setCategory);
        }


        if (!productData.title().isEmpty()) product.setTitle(productData.title());
        if (!productData.description().isEmpty()) product.setDescription(productData.description());
        if (!(productData.price() == null)) product.setPrice(productData.price());

        this.productRepository.save(product);

        return product;
    }

    public void delete(String id) {
        Product product = this.productRepository.findById(id)
                .orElseThrow(ProductNotFoundException::new);

        this.productRepository.delete(product);
    }
}
