package factory;

import DTO.NewsDTO;
import DTO.CategoryDTO;
import FormatProvider.FormatProviderCategory;
import FormatProvider.FormatProviderNews;

public class Factory {

    public static Object GetFP(Object Obj){
        if (NewsDTO.class.equals(Obj.getClass())) {
            return new FormatProviderNews();
        } else if (CategoryDTO.class.equals(Obj.getClass())) {
            return new FormatProviderCategory();
        }

        return null;
    }
}
