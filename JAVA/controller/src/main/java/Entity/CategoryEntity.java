package Entity;

public class CategoryEntity {
    long id;
    String name;
    String description;

    public CategoryEntity(long id) {
        setId(id);

        String name = "dummy"; // обращение к БД за названием категории
        setName(name);

        String description = "dummy"; // обращение к БД за описанием категории
        setDescription(description);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
