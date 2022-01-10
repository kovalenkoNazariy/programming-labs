package solvers;

public interface ISolver {
    void printResult(int[][] matrix);

    default void outputError(String error){
        /*we could use the System.err PrintStream but it delays the output by a lot ->
          it is not synced with the System.out one -> we do not understand when the error happens
        */

        System.out.println("-------------------------ERROR---------------------------\n" +
                error +
                "\n---------------------------------------------------------");
    }

    default void validateArguments(int[][] matrix) throws IllegalArgumentException{
        if(matrix.length == 0 || matrix[0].length == 0)
            throw new IllegalArgumentException();
    }
}
