package com.pradeep.blog.service;


import com.pradeep.blog.domain.entities.Category;
import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
}
