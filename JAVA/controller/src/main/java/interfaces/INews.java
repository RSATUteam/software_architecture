package interfaces;

import java.util.ArrayList;

public interface INews {
    ArrayList<Integer> getNewsList();
    Object getNews(Integer id);
    void addNews(Object news);
    boolean updateNews(Integer id, Object newNews);
    boolean deleteNews(Integer id);
}
