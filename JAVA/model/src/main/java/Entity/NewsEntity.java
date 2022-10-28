package Entity;

import controller.bo.content.Content;

import java.util.ArrayList;
import java.util.Date;

public class NewsEntity {
    long id;
    ArrayList<Integer> categoryBO;
    String Title;
    ArrayList<controller.bo.content.Content> Content;
    Date Create_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Integer> getCategoryBO() {
        return categoryBO;
    }

    public void setCategoryBO(ArrayList<Integer> categoryBO) {
        this.categoryBO = categoryBO;
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
