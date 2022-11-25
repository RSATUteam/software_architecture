package facade;

import controller.bo.CategoryBO;
import controller.bo.NewsBO;
import controller.controllers.CategoryController;
import controller.controllers.NewsController;

import java.util.ArrayList;

public class Facade {
    static NewsController newsController;
    static CategoryController categoryController;

    static {
        newsController = new NewsController();
        categoryController = new CategoryController();
    }

    public static ArrayList<NewsBO> getNewsList() {
        return newsController.getNewsList();
    }

    public static ArrayList<Integer> getNewsIdList() {
        return newsController.getNewsIdList();
    }

    public static Object getNews(Integer id) {
        return newsController.getNews(id);
    }

    public static void addNews(Object newNews) {
        newsController.addNews(newNews);
    }

    public static boolean updateNews(Integer id, Object newNews) {
        return newsController.updateNews(id, newNews);
    }

    public static boolean deleteNews(Integer id) {
        return newsController.deleteNews(id);
    }

    public static ArrayList<CategoryBO> getCategories() {
        return categoryController.getCategories();
    }

    public static CategoryBO getCategory(int id) {
        return categoryController.getCategory(id);
    }

    public static void addCategory(String name, String description) {
        categoryController.addCategory(name, description);
    }

    public static boolean updateCategory(int id, String newName, String newDescription) {
        return categoryController.updateCategory(id, newName, newDescription);
    }

    public static boolean deleteCategory(int id) {
        return categoryController.deleteCategory(id);
    }

    public static ArrayList<Integer> getCategoriesId() {
        return categoryController.getCategoriesId();
    }
}
