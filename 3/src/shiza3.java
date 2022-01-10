public class shiza3 {
    public static void main(String[] args){

        for(int i = 14; i < 17; i++){
            printResult(i, i);
        }
    }

    private static double task3(int k, double z){
        if(k >= 15){
            throw new IllegalArgumentException();
        }

        double sum = 0;

        for(int i = 1; i <= k; i++){
            sum += 1/Math.sqrt(z*i) + Math.tan((double)k/i);
        }

        return sum;
    }

    private static void printResult(int k, double z){
        try{
            System.out.println(task3(k, z));
        }catch(IllegalArgumentException exception){
            System.out.println("Exception at task3! args: k = " + k + "; z = " + z);
        }
    }
}
