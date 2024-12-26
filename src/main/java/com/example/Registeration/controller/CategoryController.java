package com.example.Registeration.controller;

import com.example.Registeration.model.Categories;
import com.example.Registeration.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public List<Categories> getCategories(){
        return categoryService.getAllCategories();
    }


    @PostMapping
    public Categories addCategory(@RequestBody Categories category){
        return categoryService.addCategory(category);
    }


    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable String id){
        categoryService.deleteById(id);
        return "Categories deleted successfully.";
    }
}
