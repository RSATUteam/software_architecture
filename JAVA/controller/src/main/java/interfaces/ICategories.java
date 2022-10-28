package interfaces;

import controller.bo.CategoryBO;

import java.util.ArrayList;

public interface ICategories {
    ArrayList<String> getCategories();

    ArrayList<Long> getCategoriesId();

    CategoryBO getCategory(long id);

    void addCategory(String name);

    boolean updateCategory(String name, String newName);

    boolean deleteCategory(String name);
}
