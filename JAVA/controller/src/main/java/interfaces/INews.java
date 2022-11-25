package interfaces;

import controller.bo.NewsBO;

import java.util.ArrayList;

public interface INews {
    ArrayList<NewsBO> getNewsList();

    Object getNews(int id);

    void addNews(Object news);

    boolean updateNews(int id, Object newNews);

    boolean deleteNews(int id);

    ArrayList<Integer> getNewsIdList();
}
