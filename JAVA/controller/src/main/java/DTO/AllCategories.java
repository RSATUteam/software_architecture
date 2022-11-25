package DTO;

import facade.Facade;

import java.util.ArrayList;

public class AllCategories {
    ArrayList<CategoryDTO> Categories;

    public AllCategories() {
        setAllCategories();
    }

    void setAllCategories() {
        setCategories(Facade.getCategoriesId());
    }

    void setCategories(ArrayList<Integer> CategoriesList) {
        Categories = new ArrayList<>();
        for (Integer cat : CategoriesList) {
            Categories.add(new CategoryDTO(cat));
        }
    }

    public ArrayList<CategoryDTO> getCategories() {
        return Categories;
    }
}
