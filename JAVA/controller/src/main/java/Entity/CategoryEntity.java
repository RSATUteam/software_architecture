package Entity;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;

public class CategoryEntity {
    int id;
    String name;
    String description;

    ArrayList<Pair<String, String>> DataCenter = new ArrayList<>(Arrays.asList(
            new Pair<>("animal pictures", "photos of animals from all over the world"),
            new Pair<>("funny cats", "photos of cats taken under unusual circumstances")
    ));

    public CategoryEntity(int id) {
        setId(id);

        // проверка на существование категории с данным id
        if (id >= DataCenter.size()) {
            setName("not found");
            setDescription("not found");
            return;
        }
        setName(DataCenter.get(id).getKey());
        setDescription(DataCenter.get(id).getValue());
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
