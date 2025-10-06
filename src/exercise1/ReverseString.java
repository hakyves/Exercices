package exercise1;

public class ReverseString {
    public static void main(String []args){
        String str = "Yves";
        System.out.println(reverse(str));

    }
    static String reverse(String str) {
//        String newStr ="";
//        for(int i= str.length()-1;i>=0;i--){
//            char c = str.charAt(i);
//            newStr = newStr + c;
//        }
//        return newStr;
//    }
        String newStr = "";
        for (int i = str.length()-1; i >=0; i--) {
            char c = str.charAt(i);

            newStr = newStr + c;
        }
        return newStr;
    }
}
