package exercise1;

public class CodifyString {
    public static void main(String []args){
        String s = "aaaaaabb";//""aaabbbccc";
        codify(s);

    }
    static void codify(String str){

        for(int i=0;i<str.length();i++){
            int count=1;
           // while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                i++;
                count++;
            }
            System.out.println(str.charAt(i)+""+count);
        }

    }
}
