package documents;

import java.nio.file.NoSuchFileException;

public abstract class Document<T> {
    protected String URI;
    protected T contents;
    protected boolean closed;

    public abstract T getContents();
    public abstract void setContents(T contents);
    public abstract void write() throws NoSuchFileException;
    public abstract void close();
}
