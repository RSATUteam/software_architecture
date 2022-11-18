package DTO;

import java.util.List;

public class AllCategoriesDTO {
    public List<CategoryDTO> list;
    public AllCategoriesDTO() {}

    public AllCategoriesDTO(List<CategoryDTO> list) {
        this.list = list;
    }
}
