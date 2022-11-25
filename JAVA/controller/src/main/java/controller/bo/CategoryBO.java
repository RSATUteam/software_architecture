package controller.bo;

import Entity.CategoryEntity;

public class CategoryBO {
    int id;
    String name;
    String description;

    public CategoryBO(int id) {
        CategoryEntity CE = new CategoryEntity(id);
        setId(id);
        setName(CE.getName());
        setDescription(CE.getDescription());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
