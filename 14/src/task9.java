import java.io.*;

public class task9 {

    public static String lastShortestString(String filename){
        FileInputStream fis;
        try{
            fis = new FileInputStream(filename);
        }catch(FileNotFoundException e){
            System.err.println("File not found!");
            return null;
        }

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(fis))){
            String line = reader.readLine();
            String str = null;
            int lowestLength = Integer.MAX_VALUE;

            while(line != null){
                if(line.length() <= lowestLength){
                    str = line;
                    lowestLength = line.length();
                }

                line = reader.readLine();
            }

            return str;
        }catch(IOException e){
            System.err.println("IOException thrown.");
            return null;
        }
    }
}
