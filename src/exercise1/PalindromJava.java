package exercise1;

public class PalindromJava {
    public static void main(String []args){
        String str ="ana";
        System.out.println(isPalindrom(str));

    }
    static boolean isPalindrom(String str){
        int i =0, j=str.length()-1;
        while(i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;


            } else {
                i++;
                i--;
            }
        }
            return true;
        }

}
