package controller.bo.content;

import javafx.scene.image.Image;

public class ImageContent extends Content{
    Image content;

    @Override
    Object getContent() {
        return (Object) content;
    }

    @Override
    void setObject(Object content) {
        this.content = (Image) content;
    }
}
