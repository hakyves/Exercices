package exercise1;

public class Atoi {
    public static void main(String[] args) {
        String str = " 456 to be removed";
        System.out.println(myAtoi(str));

    }

    public static int myAtoi(String str) {
        String newStr = "";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                newStr = newStr + c;
                 result = Integer.parseInt(newStr);
            }
        }
            return result;
        }

}
