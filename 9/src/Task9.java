public class Task9 {

    public static int getStringNumCharCombo(String str){
        if(str.length() == 0)
            return 0;

        String[] strs = str.split(" ");
        int count = 0;

        for (String s : strs) {
            boolean numberFound = false;
            boolean letterFound = false;
            for (char ch : s.toCharArray()) {
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    letterFound = true;
                } else if (ch >= '0' && ch <= '9') {
                    numberFound = true;
                }

                if (numberFound && letterFound) {
                    ++count;
                    break;
                }
            }
        }

        return count;
    }
}