package sort.methods;

import sort.Comparison;
import sort.SortMethod;
import sort.Swap;

public class BubbleSortMethod implements SortMethod, Swap {
    @Override
    public void sort(long[] array, Comparison comparator) throws NullPointerException, IllegalArgumentException {
        for(int iteration = 0; iteration < array.length - 1; ++iteration){ //array.length - 1 cuz last element will already be sorted

            boolean swapped = false;
            for(int curIndex = 0; curIndex < array.length - iteration - 1; ++curIndex){
                if(comparator.compare(array[curIndex + 1], array[curIndex])){
                    this.swapElements(array, curIndex, curIndex + 1);
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
