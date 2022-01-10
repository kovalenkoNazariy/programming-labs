package sort;

public interface SortMethod {
    void sort(long[] array, Comparison comparator) throws NullPointerException, IllegalArgumentException;
}
