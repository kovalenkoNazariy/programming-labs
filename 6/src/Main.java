import sort.Sorter;
import sort.methods.BubbleSortMethod;
import sort.methods.InsertionSortMethod;

public class Main {
    public static void main(String[] args) {
        long[][] testArrays = {
                {5, 1, 6, 7, 9, 0, -10, 5, -47},
                {5, 1, 6, 7, 9, 0, -10, 5, -47},
        };

        Sorter sorter = new Sorter(new InsertionSortMethod());

        try{
            sorter.sort(testArrays[0], (a, b) -> a > b);
            printArray(testArrays[0]);
        }catch(NullPointerException | IllegalArgumentException e){
            printException(e);
        }

        sorter.setSortMethod(new BubbleSortMethod());

        try{
            sorter.sort(testArrays[1], (a, b) -> a < b);
            printArray(testArrays[1]);
        }catch(NullPointerException | IllegalArgumentException e){
            printException(e);
        }
    }

    private static void printArray(long[] array){
        for(long element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printException(RuntimeException e){
        System.out.println("Exception: " + e.getMessage());
    }
}