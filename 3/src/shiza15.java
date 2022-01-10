public class shiza15 {
    public static void main(String[] args){
        printResult(1.0);
        printResult(-0.05);
        printResult(0.0);
    }

    private static double task15(double e){
        double sum = 0;

        for(int i = 1; i < Integer.MAX_VALUE - 2; i++){
            double nextValue = Math.pow(-1, i + 1) / (i * (i + 1) * (i + 2));

            if(nextValue < e){
                break;
            }

            sum += nextValue;
        }

        return sum;
    }

    private static void printResult(double e){
        System.out.println(task15(e));
    }
}
