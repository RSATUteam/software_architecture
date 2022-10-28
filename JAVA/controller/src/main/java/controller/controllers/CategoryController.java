package controller.controllers;

import Entity.CategoryEntity;
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
    public CategoryBO getCategory(long id) {
        CategoryEntity categoryEntity = new CategoryEntity(id); // либо притягиваем из кэша, либо пинаем штуку, которая грузит в кэш
        category.setId(categoryEntity.getId());

        category.setName(categoryEntity.getName());
        category.setDescription((categoryEntity.getDescription()));

        return category;
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
