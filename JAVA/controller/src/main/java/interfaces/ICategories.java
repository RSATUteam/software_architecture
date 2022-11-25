package interfaces;

import controller.bo.CategoryBO;

import java.util.ArrayList;

public interface ICategories {
    ArrayList<CategoryBO> getCategories();

    ArrayList<Integer> getCategoriesId();

    CategoryBO getCategory(int id);

    void addCategory(String name, String description);

    boolean updateCategory(int id, String name, String description);

    boolean deleteCategory(int id);
}
