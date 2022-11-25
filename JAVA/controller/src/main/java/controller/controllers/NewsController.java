package controller.controllers;

import Entity.NewsEntity;
import controller.bo.CategoryBO;
import controller.bo.NewsBO;
import interfaces.INews;

import javax.imageio.ImageIO;
import java.util.ArrayList;

public class NewsController implements INews {
    NewsBO news;

    @Override
    public ArrayList<Integer> getNewsList() {
        return null;
    }

    @Override
    public Object getNews(Integer id) {
        NewsEntity newsEntity = new NewsEntity(id); // либо притягиваем из кэша, либо пинаем штуку, которая грузит в кэш
        news.setId(newsEntity.getId());

        // Через контроллер категорий получаем оные по id из ArrayList в newsEntity
        CategoryController CatController = new CategoryController();
        ArrayList<CategoryBO> categoryBO = new ArrayList<>();
        for (Integer categ : newsEntity.getCategoryEntityId()) {
            categoryBO.add(CatController.getCategory(categ));
        }
        news.setCategoryBO(categoryBO);

        news.setTitle(newsEntity.getTitle());
        news.setContent(newsEntity.getContent());
        news.setPublicationDate(newsEntity.getPublicationDate());

        return news;
    }

    @Override
    public void addNews(Object news) {
    }

    @Override
    public boolean updateNews(Integer id, Object newNews) {
        return false;
    }

    @Override
    public boolean deleteNews(Integer id) {
        return false;
    }
}
