package FormatProvider;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import content.ContentType;

public class FormatProviderNews {

    public static class DataCenter {
        public static int id = 0;
        public static ArrayList<Integer> Categories = new ArrayList<>(Arrays.asList(
                0,
                1
        ));
        public static String Title = "Look at this cat";
        public static ArrayList<Pair<ContentType, String>> Content = new ArrayList<>(Arrays.asList(
                new Pair<>(ContentType.Image, "resources\\cat-in-basket.jpg"),
                //new Pair<>(ContentType.Image, ),
                new Pair<>(ContentType.Text, "C:\\Users\\term1\\Documents\\baturinIPB20\\software_architecture\\JAVA\\controller\\src\\main\\resources\\cat-in-basket.txt")
        ));
        public static Date PublicationDate = new Date(122, 10, 25, 5, 0, 2);
    }

}
