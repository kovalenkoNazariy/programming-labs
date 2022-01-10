import documents.TextDocument;

import java.nio.file.NoSuchFileException;

public class Main {

    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument("C:\\Test\\bruh.txt");
        System.out.println("Current contents: " + textDocument.getContents());
        textDocument.setContents("Test contents");

        try{
            textDocument.write();
        }catch(NoSuchFileException e){
            System.out.println(e.getMessage());
        }

        System.out.println("New contents: " + textDocument.getContents());
        System.out.println(textDocument);

        textDocument.close();
    }
}
