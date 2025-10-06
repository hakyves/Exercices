package Exercices2;

public class CharCounter {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Count :" +countCh(str));
    }

    public static int countCh(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++ ;
            }
        }
            return count;

    }
}
