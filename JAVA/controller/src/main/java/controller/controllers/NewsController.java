package controller.controllers;

import controller.bo.NewsBO;
import interfaces.INews;

import java.util.ArrayList;

public class NewsController implements INews {
    NewsBO news = null;

    @Override
    public ArrayList<NewsBO> getNewsList() {
        return null;
    }

    @Override
    public ArrayList<Integer> getNewsIdList() {
        return null;
    }

    @Override
    public Object getNews(int id) {
        if(news == null || news.getId() != id)
            news = new NewsBO(id);
        return news;
    }

    @Override
    public void addNews(Object news) {

    }

    @Override
    public boolean updateNews(int id, Object newNews) {
        return false;
    }

    @Override
    public boolean deleteNews(int id) {
        return false;
    }
}
