package sort;

public class Sorter {
    private SortMethod sortMethod;

    public void setSortMethod(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public Sorter(SortMethod sortMethod){
        this.sortMethod = sortMethod;
    }

    private void validateArguments(long[] array){
        if(array == null){
            throw new NullPointerException("@array is null at " + this.getClass().getSimpleName());
        }
    }

    public void sort(long[] array, Comparison comparison){
        validateArguments(array);
        sortMethod.sort(array, comparison);
    }
}
