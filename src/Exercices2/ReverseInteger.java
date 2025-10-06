package Exercices2;

public class ReverseInteger {
    public static void main(String []arg){
        int x =123;
        String s = Integer.toString(x);
        String newS = "";
        for(int i=0;i<=s.length();i++){
            char c = s.charAt(i);
            newS =c+newS;


        }
        int newX = Integer.parseInt(newS);
        System.out.println(newX);
    }
}
