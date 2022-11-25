package main;

import Entity.CategoryEntity;
import Entity.NewsEntity;
import controller.bo.content.ImageContent;
import controller.bo.content.TextContent;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*TextContent a = new TextContent();
        ImageContent b = new ImageContent();
        ArrayList<String> lines = (ArrayList<String>) a.getContent("D:\\IDE\\JetBrains\\IdeaProjects\\software_architecture\\JAVA\\controller\\src\\main\\resources\\cat-in-basket.txt");
        byte[] bytes = (byte[]) b.getContent("D:\\IDE\\JetBrains\\IdeaProjects\\software_architecture\\JAVA\\controller\\src\\main\\resources\\cat-in-basket.jpg");
        if (!lines.isEmpty())
            System.out.println("Lines loaded correctly!");
        if (bytes.length > 0)
            System.out.println("Picture loaded correctly!");*/
        ArrayList<CategoryEntity> categoriesList = new ArrayList<>(Arrays.asList(
                new CategoryEntity(0),
                new CategoryEntity(1),
                new CategoryEntity(2)
        ));
        System.out.println("Categories 0, 1, and unknown 2:");
        for (CategoryEntity cat : categoriesList) {
            System.out.println("<<<<<Id" + cat.getId() + ">>>>>");
            System.out.println("Name: " + cat.getName());
            System.out.println("Description: " + cat.getDescription());
        }
        System.out.println();
        System.out.println("News 0, and unknown 1:");
        ArrayList<NewsEntity> newsList = new ArrayList<>(Arrays.asList(
                new NewsEntity(0),
                new NewsEntity(1)
        ));
        for (NewsEntity news : newsList) {
            System.out.println("<<<<<Id: " + news.getId() + ">>>>>");
            System.out.println("Title: " + news.getTitle());
            System.out.println("Date: " + news.getPublicationDate());
            System.out.println("Category ids: " + news.getCategoryEntity());
            System.out.println("Content list size: " + news.getContent().size());
        }
    }
}
