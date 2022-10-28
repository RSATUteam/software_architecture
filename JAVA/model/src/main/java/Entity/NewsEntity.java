package Entity;

import java.util.ArrayList;
import java.util.Date;

public class NewsEntity {
    long id;
    ArrayList<Integer> categoryBO;
    String Title;
    ArrayList<controller.bo.content.Content> Content;
    Date Create_date;
}
