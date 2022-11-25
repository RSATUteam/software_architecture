package Entity;

import FormatProvider.FormatProviderCategory;

public class CategoryEntity {
    int id;
    String name;
    String description;

    public CategoryEntity(int id) {
        setId(id);

        // проверка на существование категории с данным id
        if (id >= FormatProviderCategory.DataCenter.size()) {
            setName("not found");
            setDescription("not found");
            return;
        }
        setName(FormatProviderCategory.DataCenter.get(id).getKey());
        setDescription(FormatProviderCategory.DataCenter.get(id).getValue());
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
