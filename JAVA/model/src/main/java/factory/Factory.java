package factory;

import DTO.NewsDTO;
import DTO.CategoryDTO;
import FP.FPC;
import FP.FPN;

public class Factory {

    public static Object GetFP(Object Obj){
        if (NewsDTO.class.equals(Obj.getClass())) {
            return new FPN();
        } else if (CategoryDTO.class.equals(Obj.getClass())) {
            return new FPC();
        }

        return null;
    }
}
