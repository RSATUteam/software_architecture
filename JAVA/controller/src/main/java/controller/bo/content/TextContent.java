package controller.bo.content;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class TextContent extends Content {
    ArrayList<String> content;

    @Override
    public Object getContent() {
        return content;
    }

    @Override
    void setContent(Object content) {
        if (!content.getClass().isArray()) {
            System.out.println("TextContent ERR: Attempt to assign "
                    + content.getClass().getCanonicalName() + " to "
                    + this.content.getClass().getCanonicalName());
            return;
        }
        this.content = (ArrayList<String>) content;
    }

    @Override
    public void loadContent(String path) {
        content = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            stream.forEach(line -> this.content.add(line));
        } catch (IOException e) {
            System.out.println("TextContent ERR: Can't read file '" + path + "'");
            throw new RuntimeException(e);
        }
    }
}
