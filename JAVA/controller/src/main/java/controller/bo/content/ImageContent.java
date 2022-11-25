package controller.bo.content;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageContent extends Content {
    byte[] content;

    @Override
    public Object getContent() {
        return (Object) content;
    }

    @Override
    void setContent(Object content) {
        this.content = (byte[]) content;
    }

    @Override
    public void loadContent(String strPath) {
        File file = new File(strPath);
        if (!file.exists()) {
            System.out.println("ImageContent ERR: Can't open file '" + strPath + "'");
            throw new RuntimeException("Error");
        }
        try (InputStream is = file.toURI().toURL().openStream()) {
            Path path = Paths.get(strPath);
            long size = Files.size(path);
            content = new byte[(int) size];
            int length = is.read(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
