/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.hyunseda.market.service;

import java.util.List;

/**
 *
 * @author FABIAN G
 */
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public boolean saveCategory(String name) {
        Category newCategory = new Category();
        newCategory.setName(name);
        return !newCategory.getName().isEmpty() && categoryRepository.save(newCategory);
    }

    public List<Category> findAllProducts() {
        return categoryRepository.findAll();
    }

    public Category findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }
    public boolean editCategory(Long categoryId, Category cat) {
        return cat != null && !cat.getName().isEmpty() && categoryRepository.update(categoryId, cat);
    }
    public boolean deleteCategory(Long id) {
        return categoryRepository.delete(id);
    }
}
