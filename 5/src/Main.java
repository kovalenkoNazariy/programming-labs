import solvers.ISolver;
import solvers.types.*;

public class Main {

    public static void main(String[] args) {
        ISolver[] solvers = new ISolver[]{new Solver_2(), new Solver_9()};

        for(ISolver solver : solvers){
            solver.printResult(generateRandomMatrix());
            System.out.println();
        }
    }

    private static int generateRandomInt(){
        return (int)(Math.random()*10);
    }

    private static int[][] generateRandomMatrix(){
        int rows = generateRandomInt();
        int columns = generateRandomInt();

        int[][] matrix = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = generateRandomInt();
            }
        }

        return matrix;
    }
}
