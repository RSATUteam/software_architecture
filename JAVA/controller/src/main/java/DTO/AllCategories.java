package DTO;

import controller.controllers.CategoryController;

import java.util.ArrayList;

public class AllCategories {
    ArrayList<CategoryDTO> Categories;
    CategoryController controller;

    public AllCategories() {
        setAllCategories();
    }

    void setAllCategories() {
        setCategories(controller.getCategoriesId());
    }

    void setCategories(ArrayList<Integer> CategoriesList) {
        for (Integer cat : CategoriesList) {
            Categories.add(new CategoryDTO(cat));
        }
    }

    public ArrayList<CategoryDTO> getCategories() {
        return Categories;
    }
}
