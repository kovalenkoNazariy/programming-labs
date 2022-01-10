public class Task2 {

    private static final int sizeOfInt = 32;

    public static String intToBinaryString(int num){
        StringBuilder str = new StringBuilder(sizeOfInt);

        for(int i = sizeOfInt - 1; i >= 0; --i){
            str.append((num >> i) & 1);
        }

        int indexOf1 = str.toString().indexOf('1');
        return str.substring(indexOf1 == -1 ? 0 : indexOf1);
    }
}