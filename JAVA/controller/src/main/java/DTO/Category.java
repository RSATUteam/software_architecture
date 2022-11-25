package DTO;

import controller.bo.CategoryBO;
import controller.controllers.CategoryController;

public class Category {
    CategoryBO categoryBO;
    CategoryController controller;

    public Category(String id) {
        setCategoryBO(Integer.getInteger(id));
    }
    public Category(Integer id) {
        setCategoryBO(id);
    }

    public CategoryBO getCategoryBO() {
        return categoryBO;
    }

    public void setCategoryBO(CategoryBO categoryBO) {
        this.categoryBO = categoryBO;
    }

    public void setCategoryBO(Integer categoryBOID) {
        this.categoryBO = controller.getCategory(categoryBOID);
    }
}
