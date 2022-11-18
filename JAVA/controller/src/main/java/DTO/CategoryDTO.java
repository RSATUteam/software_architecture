package DTO;

public class CategoryDTO {
    public String id;
    public String name;
    public int newsCount;

    public CategoryDTO() {}
    public CategoryDTO(String id, String name, int newsCount) {
        this.id = id;
        this.name = name;
        this.newsCount = newsCount;
    }
}
