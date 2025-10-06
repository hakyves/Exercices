package Feb2023Exercise;

public class StringReverse {
    public static void main(String []args){

        String str ="12345";
        System.out.println(reverse(str));


    }
    public static String reverse(String str){
        String nStr="";
        int n =str.length();

        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            nStr = c+nStr;


        }
        return nStr;
    }
}
