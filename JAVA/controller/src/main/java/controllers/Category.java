package controllers;

import interfaces.ICategories;

import java.util.ArrayList;

public class Category implements ICategories {
    long id;
    String name;

    @Override
    public ArrayList<String> getCategories() {
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
