package controller.bo;

import java.util.ArrayList;
import java.util.Date;

public class NewsBO {
    long id;
    ArrayList<CategoryBO> categoryBO;
    String Title;
    ArrayList<controller.bo.content.Content> Content;
    Date Create_date;
}
