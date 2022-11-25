package controller.bo;

import Entity.NewsEntity;
import controller.bo.content.Content;

import java.util.ArrayList;
import java.util.Date;

public class NewsBO {
    int id;
    ArrayList<Integer> categoryEntityId;
    String Title;
    ArrayList<Content> ContentList;
    Date PublicationDate;

    public NewsBO(int id) {
        NewsEntity NE = new NewsEntity(id);
        setId(id);
        setTitle(NE.getTitle());
        setPublicationDate(NE.getPublicationDate());
        setContent(NE.getContent());
        setCategoryEntityId(NE.getCategoryEntityId());
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getCategoryEntityId() {
        return categoryEntityId;
    }

    public void setCategoryEntityId(ArrayList<Integer> categoryBO) {
        this.categoryEntityId = categoryBO;
    }

    public ArrayList<controller.bo.content.Content> getContent() {
        return ContentList;
    }

    public void setContent(ArrayList<Content> content) {
        ContentList = content;
    }

    public Date getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(Date date) {
        PublicationDate = date;
    }
}
