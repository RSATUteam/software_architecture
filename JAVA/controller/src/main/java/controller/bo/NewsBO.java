package controller.bo;

import controller.bo.content.Content;

import java.util.ArrayList;
import java.util.Date;

public class NewsBO {
    long id;
    ArrayList<CategoryBO> categoryBO;
    String Title;
    ArrayList<Content> Content;
    Date Create_date;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<CategoryBO> getCategoryBO() {
        return categoryBO;
    }

    public void setCategoryBO(ArrayList<CategoryBO> categoryBO) {
        this.categoryBO = categoryBO;
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
