package sort.methods;

import sort.SortMethod;
import sort.Swap;

public class SelectionSortMethod implements SortMethod, Swap {

    @Override
    public void sort(long[] array) throws NullPointerException, IllegalArgumentException {
        for(int startIndex = 0; startIndex < array.length - 1; ++startIndex){
            int largestIndex = startIndex;

            for(int currentIndex = startIndex + 1; currentIndex < array.length; ++currentIndex){
                if(array[currentIndex] > array[largestIndex])
                    largestIndex = currentIndex;
            }

            this.swapElements(array, startIndex, largestIndex);
        }
    }
}
