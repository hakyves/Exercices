package Exercices2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int base = sc.nextInt();
        System.out.println("Enter exponent");
        int exp = sc.nextInt();
        System.out.println("Base is "+base+" And exponent is "+exp);
        double expValue = Math.pow(base, exp);
        System.out.println("Exp value "+expValue);

    }
}
