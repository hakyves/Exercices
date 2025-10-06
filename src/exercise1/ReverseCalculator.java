package exercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseCalculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        String s = sc.nextLine();
        String newString ="";
        StringBuilder newS = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            newString = c+ newString;

        }
        System.out.println(newString);

    }
}
