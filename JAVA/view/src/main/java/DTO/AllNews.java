package DTO;

import com.sun.org.apache.xpath.internal.operations.Bool;
import controller.bo.CategoryBO;
import controller.bo.NewsBO;
import controller.controllers.NewsController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class AllNews {
    ArrayList<NewsBO> News;
    NewsController controller;
    AllNews(){
        GetAll();
    }
    AllNews(ForSort SortField,boolean forward){
        GetAll();
        Sort(SortField,forward);
    }

    AllNews(CategoryBO Category){
        GetAll();
        Filter(Category);
    }

    AllNews(ForSort SortField,boolean forward,CategoryBO Category){
        GetAll();
        Filter(Category);
        Sort(SortField,forward);
    }

    void GetAll(){
        ArrayList<Integer> NewsI=controller.getNewsList();
        News=new ArrayList<>();
        for (Integer integer : NewsI) {
            News.add((NewsBO) controller.getNews(integer));
        }
    }

    void Sort(ForSort SortField,boolean forward){
        switch (SortField){
            case Title: {
                News.sort((o1, o2) -> {
                    if (forward)
                        return o1.getTitle().compareTo(o2.getTitle());
                    return o2.getTitle().compareTo(o1.getTitle());
                });
            }break;
            case Date:{
                News.sort((o1, o2) -> {
                    if (forward)
                        return o1.getCreate_date().compareTo(o2.getCreate_date());
                    return o2.getCreate_date().compareTo(o1.getCreate_date());
                });
            } break;
        }
    }

    void Filter(CategoryBO category){
        ArrayList<NewsBO> NewNews=new ArrayList<>();
        for(NewsBO news:News){
            for(CategoryBO cat:news.getCategoryBO()){
                if(cat.getId()==category.getId())
                {
                  NewNews.add(news);
                  break;
                }
            }
        }
        News = NewNews;
    }
}
enum ForSort
{
    Title,Date
}