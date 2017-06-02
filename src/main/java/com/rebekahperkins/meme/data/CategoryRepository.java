package com.rebekahperkins.meme.data;

import com.rebekahperkins.meme.model.Category;
import com.rebekahperkins.meme.model.Meme;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(123, "white guys"),
            new Category(456, "puppets"),
            new Category(789, "other"));

    public Category findById(int id){
        for(Category category : ALL_CATEGORIES){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }
}
