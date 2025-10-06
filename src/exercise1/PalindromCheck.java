package exercise1;

public class PalindromCheck {
    public static void main(String []args){
        String abd = "ANA";
        System.out.println(checkPal(abd));
    }

    static boolean checkPal(String str){
        String str1 ="";
        String str2="";
        char ch1;
        char ch2;
        boolean flag = false;
        int i=0,j= str.length()-1;
        while(i<j) {


            for (i = 0; i < str.length(); i++) {
                ch1 = str.charAt(i);
                str1 = str1 + ch1;

            }
            System.out.println(str1);
            for (j = str.length() - 1; j >= 0; j--) {
                ch2 = str.charAt(j);
                str2 = str2 + ch2;

            }
            System.out.println(str2);
            if (str1.equals(str2)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

}
