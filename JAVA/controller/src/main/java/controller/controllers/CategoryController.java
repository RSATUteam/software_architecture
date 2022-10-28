package controller.controllers;

import controller.bo.CategoryBO;
import interfaces.ICategories;

import java.util.ArrayList;

public class CategoryController implements ICategories {
    CategoryBO category;

    @Override
    public ArrayList<String> getCategories() {
        return null;
    }

    @Override
    public ArrayList<Long> getCategoriesId() {
        return null;
    }

    @Override
    public CategoryBO getCategory(int id) {
        return null;
    }

    @Override
    public void addCategory(String name) {

    }

    @Override
    public boolean updateCategory(String name, String newName) {
        return false;
    }

    @Override
    public boolean deleteCategory(String name) {
        return false;
    }
}
