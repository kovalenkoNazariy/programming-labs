package sort.methods;

import sort.SortMethod;

public class InsertionSortMethod implements SortMethod {

    @Override
    public void sort(long[] array) throws NullPointerException, IllegalArgumentException {
        for(int startIndex = 1; startIndex < array.length; ++startIndex){
            long startValue = array[startIndex];
            int currentIndex = startIndex - 1;

            while(currentIndex >= 0 && startValue > array[currentIndex]){
                array[currentIndex + 1] = array[currentIndex];
                --currentIndex;
            }

            array[currentIndex + 1] = startValue;
        }
    }
}
