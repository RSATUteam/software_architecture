package controller.bo.content;

public abstract class Content {
    abstract Object getContent();

    abstract void setContent(Object content);

    public abstract void loadContent(String path);
}
