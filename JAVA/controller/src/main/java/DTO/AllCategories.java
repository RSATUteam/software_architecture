package DTO;


import controller.bo.CategoryBO;
import controller.controllers.CategoryController;

import java.util.ArrayList;

public class AllCategories {
    ArrayList<CategoryBO> Categories;
    CategoryController controller;

    AllCategories() {
        setAllCategories();
    }

    void setAllCategories() {
        setCategories(controller.getCategoriesId());
    }

    void setCategories(ArrayList<Long> CategoriesList) {
        for (Long cat : CategoriesList) {
            Category category = new Category(cat);
            Categories.add(category.getCategoryBO());
        }
    }
}
