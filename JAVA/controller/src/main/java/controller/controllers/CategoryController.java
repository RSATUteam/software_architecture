package controller.controllers;

import controller.bo.CategoryBO;
import interfaces.ICategories;

import java.util.ArrayList;

public class CategoryController implements ICategories {
    CategoryBO category = null;

    @Override
    public ArrayList<CategoryBO> getCategories() {
        return null;
    }

    @Override
    public ArrayList<Integer> getCategoriesId() {
        return null;
    }

    @Override
    public CategoryBO getCategory(int id) {
        if(category == null || category.getId() != id)
            category = new CategoryBO(id);
        return category;
    }

    @Override
    public void addCategory(String name, String description) {

    }

    @Override
    public boolean updateCategory(int id, String newName, String newDescription) {
        return false;
    }

    @Override
    public boolean deleteCategory(int id) {
        return false;
    }
}
