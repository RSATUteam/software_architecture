package interfaces;

import java.util.ArrayList;

public interface ICategories {
    ArrayList<String> getCategories();
    void addCategory(String name);
    boolean updateCategory(String name, String newName);
    boolean deleteCategory(String name);
}
