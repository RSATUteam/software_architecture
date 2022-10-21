package controllers;

import interfaces.INews;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Date;

public class News implements INews {
    long id;
    Category category;
    String Title;
    ArrayList<String> Text;
    ArrayList<Image> Images;
    ArrayList<Integer> Content;
    Date Create_date;

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
