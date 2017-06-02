package com.rebekahperkins.meme.controller;

import com.rebekahperkins.meme.data.CategoryRepository;
import com.rebekahperkins.meme.data.MemeRepository;
import com.rebekahperkins.meme.model.Category;
import com.rebekahperkins.meme.model.Meme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private MemeRepository memeRepository;

    @RequestMapping("/categories")
    public String getAllCategories(ModelMap modelMap){
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String getCategory(@PathVariable int id, ModelMap modelMap){
        Category category = categoryRepository.findById(id);
        modelMap.put("category", category);

        List<Meme> memes = memeRepository.findByCategoryId(id);
        modelMap.put("memes", memes);
        return "category";
    }
}
