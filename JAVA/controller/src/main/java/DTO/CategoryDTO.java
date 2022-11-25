package DTO;

import controller.bo.CategoryBO;
import facade.Facade;

public class CategoryDTO {
    int id;
    String Name;
    String Description;

    public CategoryDTO(int id) {
        setCategory(id);
    }

    public CategoryDTO(String id) {
        setCategory(Integer.getInteger(id));
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setCategory(int categoryId) {
        CategoryBO CBO = (CategoryBO) Facade.getCategory(categoryId);
        id = CBO.getId();
        Name = CBO.getName();
        Description = CBO.getDescription();
    }
}
