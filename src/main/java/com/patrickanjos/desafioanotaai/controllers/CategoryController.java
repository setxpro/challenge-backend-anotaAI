package com.patrickanjos.desafioanotaai.controllers;

import com.patrickanjos.desafioanotaai.domain.category.Category;
import com.patrickanjos.desafioanotaai.domain.category.CategoryDTO;
import com.patrickanjos.desafioanotaai.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<Category> insert(@RequestBody CategoryDTO categoryData) {
       Category newCategory = this.categoryService.insert(categoryData);
       return ResponseEntity.ok().body(newCategory);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        List<Category> categories = this.categoryService.getAll();
        return ResponseEntity.ok().body(categories);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@PathVariable(value = "id") String id, @RequestBody CategoryDTO categoryData) {
        Category updatedCategory = this.categoryService.update(id, categoryData);
        return ResponseEntity.ok().body(updatedCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Category> delete(@PathVariable(value = "id") String id) {
        this.categoryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
