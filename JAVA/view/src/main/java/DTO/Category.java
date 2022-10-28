package DTO;

import controller.bo.CategoryBO;
import controller.controllers.CategoryController;

public class Category {
    CategoryBO categoryBO;
    CategoryController controller;
    Category(Long id){
        setCategoryBO(id);
    }

    public CategoryBO getCategoryBO() {
        return categoryBO;
    }

    public void setCategoryBO(CategoryBO categoryBO) {
        this.categoryBO = categoryBO;
    }
    public void setCategoryBO(int categoryBOID) {
        this.categoryBO = controller.getCategory(categoryBOID);
    }
}
