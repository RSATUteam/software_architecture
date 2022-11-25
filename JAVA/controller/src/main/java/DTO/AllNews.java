package DTO;

import controller.bo.CategoryBO;
import facade.Facade;

import java.util.ArrayList;

enum ForSort {
    Title, Date
}

public class AllNews {
    ArrayList<NewsDTO> newsDTOList;
    Facade facade;

    public AllNews() {
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
        setNews(facade.getNewsIdList());
    }

    void setNews(ArrayList<Integer> NewsId) {
        newsDTOList = new ArrayList<>();
        for (Integer idx : NewsId) {
            newsDTOList.add(new NewsDTO(idx));
        }
    }

    void Sort(ForSort SortField, boolean forward) {
        switch (SortField) {
            case Title: {
                newsDTOList.sort((o1, o2) -> {
                    if (forward)
                        return o1.getTitle().compareTo(o2.getTitle());
                    return o2.getTitle().compareTo(o1.getTitle());
                });
            }
            break;
            case Date: {
                newsDTOList.sort((o1, o2) -> {
                    if (forward)
                        return o1.getPublicationDate().compareTo(o2.getPublicationDate());
                    return o2.getPublicationDate().compareTo(o1.getPublicationDate());
                });
            }
            break;
        }
    }

    void Filter(CategoryBO category) {
        ArrayList<NewsDTO> NewNews = new ArrayList<>();
        for (NewsDTO news : newsDTOList) {
            for (CategoryBO cat : news.getCategoriesBO()) {
                if (cat.getId() == category.getId()) {
                    NewNews.add(news);
                    break;
                }
            }
        }
        newsDTOList = NewNews;
    }

    public ArrayList<NewsDTO> getNewsDTOList() {
        return newsDTOList;
    }
}