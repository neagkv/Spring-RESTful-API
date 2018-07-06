package com.dev.springrestdemo.service;

import com.dev.springrestdemo.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * @author Kevin Neag
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
