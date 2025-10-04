package CodingInterview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GameOfThrones {
    public static void main(String[] args) {
        String str = "aaabbbb";
        System.out.println(isThisAnagramPalindrome(str));
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(9, 8, 9));
        System.out.println(diagonalDifference(list));
        int n = 5;
        printStaircase(n);
        List<Integer> lst = Arrays.asList(1,2,3,4,5);
        factorial(n);

    }

    public static String isThisAnagramPalindrome(String str) {

        char[] strChar = str.toCharArray();
        List<Character> ch = new ArrayList<>();
        for (char c : strChar) {
            ch.add(c);
        }
        Map<Character, Long> map = ch.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Collection<Long> value = map.values();
        System.out.println("Velue : " + value);
        if (value.stream().allMatch(e -> e % 2 == 0)) {
            return "YES";
        } else if (value.stream().filter(e -> e % 2 != 0).count() == 1) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static int diagonalDifference(List<List<Integer>> list) {
        // Write your code here

        int calc = 0;
        int calc2 = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i).get(i));
            calc += list.get(i).get(i);
        }
        System.out.println("===============================");
        int resulSize = list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(resulSize - 1) + " : " + list.get(i).get(resulSize - 1));
            calc2 += list.get(i).get(resulSize - 1);
            resulSize--;
        }

        System.out.println("===============================");
        return Math.abs(calc - calc2);

    }
    public static void printStaircase(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("u");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void factorial(int n) {
        int result = 1;
        for(int i=n;i>0;i--){
            result *= i;
        }
        System.out.println(result);

    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maximum = 0;
        int numberOfMaximums = 0;
        for(int i = 0; i < candles.size(); i++) {
            int height = candles.get(i);
            if (maximum < height) {
                maximum = height;
                numberOfMaximums = 0;
            }
            if (maximum == height) {
                numberOfMaximums += 1;
            }
        }
        return numberOfMaximums;
    }
    public static int birthdayCakeCandlesMine(List<Integer> candles) {
        // Write your code here
        List<Integer> sorted = candles.stream().sorted().collect(Collectors.toList());
        int n =candles.size();
        int count =1;
        //  System.out.println(n);
        for(int i=candles.size();i>=0;i--){
            // System.out.println(sorted.get(i));
            if(sorted.get(i-1)==sorted.get(i-2)){
                count ++;
            }else {
                count = count;
                break;
            }
        }
        return count;
    }
}
