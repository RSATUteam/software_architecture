package DTO;

import controller.bo.NewsBO;
import controller.controllers.NewsController;

public class News {
    NewsBO news;
    NewsController controller;

    News(int id) {
        setNews(id);
    }

    public NewsBO getNews() {
        return news;
    }

    public void setNews(NewsBO news) {
        this.news = news;
    }

    public void setNews(int newsId) {
        this.news = (NewsBO) controller.getNews(newsId);
    }
}
