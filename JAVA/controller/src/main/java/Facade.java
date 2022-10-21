import controllers.Category;
import controllers.News;
import interfaces.INews;

import java.util.ArrayList;

public class Facade {
    News news;
    Category category;
    ArrayList<Integer> getNewsList() {
        return news.getNewsList();
    }

    Object getNews(Integer id) {
        return news.getNews(id);
    }
    void addNews(Object newNews){
        news.addNews(newNews);
    }

    boolean updateNews(Integer id, Object newNews) {
        return news.updateNews(id,newNews);
    }

    boolean deleteNews(Integer id){
        return news.deleteNews(id);
    }

    ArrayList<String> getCategories() {
        return category.getCategories();
    }

    void addCategory(String name){
        category.addCategory(name);
    }

    boolean updateCategory(String name, String newName) {
        return category.updateCategory(name, newName);
    }

    boolean deleteCategory(String name){
        return category.deleteCategory(name);
    }
}
