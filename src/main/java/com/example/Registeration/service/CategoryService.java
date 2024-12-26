package com.example.Registeration.service;

import com.example.Registeration.model.Categories;
import com.example.Registeration.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoriesRepository categoriesRepository;


    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    public Categories addCategory(Categories categories) {
        return categoriesRepository.save(categories);
    }

    public void deleteById(String Id){
        categoriesRepository.deleteById(Id);
    }
}
