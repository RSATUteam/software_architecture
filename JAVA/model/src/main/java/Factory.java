import DTO.News;
import DTO.CategoryDTO;
import FP.FPC;
import FP.FPN;

public class Factory {

    public static Object GetFP(Object Obj){
        switch (Object.class){
            case News.class: return new FPN();
            case CategoryDTO.class: return new FPC();
        }

    }
}
