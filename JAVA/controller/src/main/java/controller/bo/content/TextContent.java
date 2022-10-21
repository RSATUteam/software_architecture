package controller.bo.content;

public class TextContent extends Content{
    String content;

    @Override
    Object getContent() {
        return (Object) content;
    }

    @Override
    void setObject(Object content) {
        this.content = (String) content;
    }
}
