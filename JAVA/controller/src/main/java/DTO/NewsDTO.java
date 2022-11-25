package DTO;

import controller.bo.CategoryBO;
import controller.bo.NewsBO;
import controller.bo.content.Content;
import facade.Facade;

import java.util.ArrayList;
import java.util.Date;

public class NewsDTO {
    int id;
    String Title;
    ArrayList<CategoryBO> CategoriesBOList;
    ArrayList<Content> ContentList;
    Date PublicationDate;

    NewsDTO(int id) {
        setNews(id);
    }

    public String getTitle() {
        return Title;
    }

    public ArrayList<CategoryBO> getCategoriesBO() {
        return CategoriesBOList;
    }

    public ArrayList<Content> getContent() {
        return ContentList;
    }

    public Date getPublicationDate() {
        return PublicationDate;
    }

    public void setNews(int newsId) {
        NewsBO NBO = (NewsBO) Facade.getNews(newsId);
        id = NBO.getId();
        Title = NBO.getTitle();
        ContentList = NBO.getContent();
        PublicationDate = NBO.getPublicationDate();

        ArrayList<Integer> categoriesIds = NBO.getCategoryEntityId();
        CategoriesBOList = new ArrayList<>();
        for (Integer idx : categoriesIds)
            CategoriesBOList.add(Facade.getCategory(idx));
    }
}
