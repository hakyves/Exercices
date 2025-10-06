package exercise1;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String []args){
        double balance = 0, minbal = 500, depositAmt =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your deposit amount ");
            depositAmt = sc.nextInt();
        }while(depositAmt<minbal);
        balance += depositAmt;
        System.out.println("Your deposit is successful");

        }
    }

