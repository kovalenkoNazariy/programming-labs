public class shiza9 {
    public static void main(String[] args){

        printResult(-2, 2);
        for(int i = -3; i < 5; i++){
            printResult(i, i);
        }
    }

    private static double task9(int t, double l){
        if(l % 2 == 0){
            if(t * l < 0){
                throw new IllegalArgumentException();
            }

            return Math.sqrt(t * l) * t;
        }

        if(t <= 0){
            throw new IllegalArgumentException();
        }

        return (l / Math.sqrt(t)) * t;
    }

    private static void printResult(int t, double l){
        try{
            System.out.println(task9(t, l));
        }catch(IllegalArgumentException exception){
            System.out.println("Exception at task9! args: t = " + t + "; l = " + l);
        }
    }
}
