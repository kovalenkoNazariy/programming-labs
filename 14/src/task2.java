import java.io.FileInputStream;
import java.io.IOException;

public class task2 {

    public static long longestZeroSequenceLength(String filename){
        try(FileInputStream fis = new FileInputStream(filename)){
            byte[] bytes = new byte[8192];
            int len = fis.read(bytes);

            long result = 0;

            long counter = 0;
            for(int i = 0; i < len; ++i){
                if(bytes[i] == 0){
                    ++counter;

                    if(counter > result)
                        result = counter;
                }else{
                    counter = 0;
                }
            }

            fis.close();

            return result;
        }catch(IOException e){
            System.err.println("IOException thrown.");
            return -1;
        }
    }
}
