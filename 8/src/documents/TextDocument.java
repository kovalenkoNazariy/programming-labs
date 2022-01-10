package documents;

import java.nio.file.NoSuchFileException;
import java.util.Objects;

public class TextDocument extends Document<String>{

    public TextDocument(String URI){
        this.URI = URI;
        this.contents = "";
        this.closed = false;
    }

    public TextDocument(String URI, String contents){
        this.URI = URI;
        this.contents = contents;
        this.closed = false;
    }

    @Override
    public String getContents() {
        return contents;
    }

    @Override
    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public void write() throws NoSuchFileException {
        if(closed){
            throw new NoSuchFileException("No such file found.");
        }

        System.out.println("Wrote \"" + contents + "\" to file located in " + URI);
    }

    @Override
    public void close(){
        this.URI = "";
        this.closed = true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(URI);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null)
            return false;

        if(this.getClass() != obj.getClass())
            return false;

        TextDocument document = (TextDocument)obj;

        return this.URI.equals(document.URI);
    }

    @Override
    public String toString() {
        return "TextDocument{" +
                "URI='" + URI + '\'' +
                '}';
    }
}
