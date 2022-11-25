package Entity;

import controller.bo.content.Content;
import controller.bo.content.ContentType;
import controller.bo.content.ImageContent;
import controller.bo.content.TextContent;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class NewsEntity {
    int id;
    ArrayList<Integer> categoryEntity;
    String Title;
    ArrayList<Content> Content;
    Date PublicationDate;

    static class DataCenter {
        static int id = 0;
        static ArrayList<Integer> Categories = new ArrayList<>(Arrays.asList(
                0,
                1
        ));
        static String Title = "Look at this cat";
        static ArrayList<Pair<ContentType, String>> Content = new ArrayList<>(Arrays.asList(
            new Pair<>(ContentType.Image, "resources\\cat-in-basket.jpg"),
            //new Pair<>(ContentType.Image, ),
            new Pair<>(ContentType.Text, "C:\\Users\\term1\\Documents\\baturinIPB20\\software_architecture\\JAVA\\controller\\src\\main\\resources\\cat-in-basket.txt")
        ));
        static Date PublicationDate = new Date(122, 10, 25, 5, 0, 2);
    }

    public NewsEntity(int id) {
        setId(id);

        // проверка на существование категории с данным id. По-хорошему, DataCenter должен "вернуть" массив новостей
        if (id != DataCenter.id) {
            setCategoryEntity(new ArrayList<>());
            setTitle("not found");
            setContent(new ArrayList<>());
            setPublicationDate(new Date());
            return;
        }

        // обращение к БД за списком категорий
        ArrayList<Integer> bdCategories = DataCenter.Categories;
        setCategoryEntity(bdCategories);

        // обращение к БД за заголовком новости
        String Title = DataCenter.Title;
        setTitle(Title);

        // обращение к БД за наполнением новости
        ArrayList<Pair<ContentType, String>> ContentDescriptors = DataCenter.Content;
        // загрузка контента
        ArrayList<Content> Content = new ArrayList<>();
        for (Pair<ContentType, String> contentDescriptor : ContentDescriptors) {
            Content cont;
            switch (contentDescriptor.getKey()) {
                case Image: {
                    cont = new ImageContent();
                    break;
                }
                case Text:
                default: {
                    cont = new TextContent();
                    break;
                }
            }
            cont.loadContent(contentDescriptor.getValue());
            Content.add(cont);
        }
        setContent(Content);

        // обращение к БД за датой создания новости
        Date PublicationDate = DataCenter.PublicationDate;
        setPublicationDate(PublicationDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getCategoryEntityId() {
        return categoryEntity;
    }

    public void setCategoryEntity(ArrayList<Integer> categoryEntity) {
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

    public Date getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        PublicationDate = publicationDate;
    }
}
