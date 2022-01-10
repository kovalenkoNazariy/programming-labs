package sort;

@FunctionalInterface
public interface Comparison {
    boolean compare(long a, long b);
}
