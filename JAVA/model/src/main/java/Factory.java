import DTO.News;
import DTO.Category;
import FP.FPC;
import FP.FPN;

public class Factory {

    public static Object GetFP(Object Obj){
        switch (Object.class){
            case News.class: return new FPN();
            case Category.class: return new FPC();
        }

    }
}
