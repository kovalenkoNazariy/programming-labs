package solvers.types;

import solvers.ISolver;

public class Solver_9 implements ISolver {
    private int[] toArray(int[][] matrix) {
        validateArguments(matrix);

        int[] array = new int[matrix.length*matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            //there's System.arraycopy for this but i never used it so cant be bothered
            for(int j = 0; j < matrix[0].length; j++){
                array[matrix[0].length*i + j] = matrix[i][j];
            }
        }

        return array;
    }

    @Override
    public void printResult(int[][] matrix) {
        try{
            int[] temp = toArray(matrix);

            for(int i : temp){
                System.out.print(i + " ");
            }
        }catch(Exception e){
            outputError(e.getClass().getSimpleName() + " caught at " + this.getClass().getSimpleName());
        }
    }
}
