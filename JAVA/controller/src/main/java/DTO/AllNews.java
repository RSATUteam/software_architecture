package DTO;

import controller.bo.CategoryBO;
import controller.bo.NewsBO;
import controller.controllers.NewsController;

import java.util.ArrayList;

enum ForSort {
    Title, Date
}

public class AllNews {
    ArrayList<NewsBO> NewsList;
    NewsController controller;

    AllNews() {
        setAllNews();
    }

    AllNews(ForSort SortField, boolean forward) {
        setAllNews();
        Sort(SortField, forward);
    }

    AllNews(CategoryBO Category) {
        setAllNews();
        Filter(Category);
    }

    AllNews(ForSort SortField, boolean forward, CategoryBO Category) {
        setAllNews();
        Filter(Category);
        Sort(SortField, forward);
    }

    void setAllNews() {
        setNews(controller.getNewsList());
    }

    void setNews(ArrayList<Integer> NewsI) {
        NewsList = new ArrayList<>();
        for (Integer integer : NewsI) {
            News news = new News(integer);
            NewsList.add(news.getNews());
        }
    }

    void Sort(ForSort SortField, boolean forward) {
        switch (SortField) {
            case Title: {
                NewsList.sort((o1, o2) -> {
                    if (forward)
                        return o1.getTitle().compareTo(o2.getTitle());
                    return o2.getTitle().compareTo(o1.getTitle());
                });
            }
            break;
            case Date: {
                NewsList.sort((o1, o2) -> {
                    if (forward)
                        return o1.getCreate_date().compareTo(o2.getCreate_date());
                    return o2.getCreate_date().compareTo(o1.getCreate_date());
                });
            }
            break;
        }
    }

    void Filter(CategoryBO category) {
        ArrayList<NewsBO> NewNews = new ArrayList<>();
        for (NewsBO news : NewsList) {
            for (CategoryBO cat : news.getCategoryBO()) {
                if (cat.getId() == category.getId()) {
                    NewNews.add(news);
                    break;
                }
            }
        }
        NewsList = NewNews;
    }
}