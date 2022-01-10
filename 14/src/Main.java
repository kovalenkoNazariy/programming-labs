import java.io.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(task9.lastShortestString("C:\\KPI_uni\\OP_labs\\14\\test.txt"));

        writeGarbageToFile("C:\\KPI_uni\\OP_labs\\14\\test2.txt");

        System.out.println(task2.longestZeroSequenceLength("C:\\KPI_uni\\OP_labs\\14\\test2.txt"));
    }

    private static void writeGarbageToFile(String filename){
        try(FileOutputStream fos = new FileOutputStream(filename)){
            for(int i = 0; i < 3; ++i){
                fos.write(0);
            }

            for(int i = 0; i < 3; ++i){
                fos.write(125);
            }

            for(int i = 0; i < 5; ++i){
                fos.write(0);
            }

            for(int i = 0; i < 3; ++i){
                fos.write(125);
            }

            for(int i = 0; i < 2; ++i){
                fos.write(0);
            }
        }catch(IOException e){
            System.err.println("IOException thrown.");
        }
    }
}
