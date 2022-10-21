package controller.controllers;

import controller.bo.NewsBO;
import interfaces.INews;

import java.util.ArrayList;

public class NewsController implements INews {
    NewsBO news;

    @Override
    public ArrayList<Integer> getNewsList() {
        return null;
    }

    @Override
    public Object getNews(Integer id) {
        return null;
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
