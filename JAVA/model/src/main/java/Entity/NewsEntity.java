package Entity;

import controller.bo.content.Content;

import java.util.ArrayList;
import java.util.Date;

public class NewsEntity {
    long id;
    ArrayList<Long> categoryEntity;
    String Title;
    ArrayList<Content> Content;
    Date Create_date;

    NewsEntity(long id) {
        setId(id);

        ArrayList<Long> bdCategories = new ArrayList<>(); // обращение к БД за списком категорий
        setCategoryEntity(bdCategories);

        String Title = "dummy"; // обращение к БД за заголовком новости
        setTitle(Title);

        ArrayList<Content> Content = new ArrayList<>(); // обращение к БД за наполнением новости
        setContent(Content);

        Date Create_date = new Date(); // обращение у БД за датой создания новости
        setCreate_date(Create_date);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Long> getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(ArrayList<Long> categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public ArrayList<controller.bo.content.Content> getContent() {
        return Content;
    }

    public void setContent(ArrayList<controller.bo.content.Content> content) {
        Content = content;
    }

    public Date getCreate_date() {
        return Create_date;
    }

    public void setCreate_date(Date create_date) {
        Create_date = create_date;
    }
}
