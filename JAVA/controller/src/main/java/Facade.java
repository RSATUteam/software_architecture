import controller.controllers.CategoryController;
import controller.controllers.NewsController;

import java.util.ArrayList;

public class Facade {
    NewsController newsController;
    CategoryController categoryController;

    ArrayList<Integer> getNewsList() {
        return newsController.getNewsList();
    }

    Object getNews(Integer id) {
        return newsController.getNews(id);
    }

    void addNews(Object newNews){
        newsController.addNews(newNews);
    }

    boolean updateNews(Integer id, Object newNews) {
        return newsController.updateNews(id,newNews);
    }

    boolean deleteNews(Integer id){
        return newsController.deleteNews(id);
    }

    ArrayList<String> getCategories() {
        return categoryController.getCategories();
    }

    void addCategory(String name){
        categoryController.addCategory(name);
    }

    boolean updateCategory(String name, String newName) {
        return categoryController.updateCategory(name, newName);
    }

    boolean deleteCategory(String name){
        return categoryController.deleteCategory(name);
    }
}
