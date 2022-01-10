public class Main {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        for(int i = -500_000; i < 500_000; ++i){
            String str = Task2.intToBinaryString(i);
        }

        System.out.println(System.currentTimeMillis() - time);
        //
        //System.out.println(Task2.intToBinaryString(25));
        //System.out.println(Task2.intToBinaryString(-32));
        //System.out.println(Task9.getStringNumCharCombo(
        //        "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago"
        //));
    }
}
