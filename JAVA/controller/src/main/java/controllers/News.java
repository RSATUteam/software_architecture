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
}
