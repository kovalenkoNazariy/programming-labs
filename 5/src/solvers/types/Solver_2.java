package solvers.types;

import solvers.ISolver;

public class Solver_2 implements ISolver {
    private void lolSwap(int[][] matrix) {
        validateArguments(matrix);

        int[] temp = matrix[matrix.length - 1];
        matrix[matrix.length - 1] = matrix[0];
        matrix[0] = temp;
    }

    @Override
    public void printResult(int[][] matrix){
        try{
            lolSwap(matrix);

            for(int[] i : matrix){
                for(int j : i){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }catch(Exception e){
            outputError(e.getClass().getSimpleName() + " caught at " + this.getClass().getSimpleName());
        }
    }
}
