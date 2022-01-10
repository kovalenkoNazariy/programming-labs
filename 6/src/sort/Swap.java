package sort;

public interface Swap {
    //this is a separate interface due to only 2/3 sorts needing this method
    default void swapElements(long[] array, int indexOne, int indexTwo){
        long temp = array[indexOne];

        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
