package bo;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Date;

public class NewsBO {
    long id;
    ArrayList<CategoryBO> categoryBO;
    String Title;
    ArrayList<String> Text;
    ArrayList<Image> Images;
    ArrayList<Integer> Content;
    Date Create_date;
}
