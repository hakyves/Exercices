package CodingInterview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanToInteger {
    public static void main(String []args) {
        Integer I = 1;
        Integer V = 5;
        Integer X = 10;
        Integer L = 50;
        Integer C = 100;
        Integer D = 500;
        Integer M = 1000;

        String si = "abca";
        String s1 ="adbc";
        String s2 ="cbad";
        System.out.println(checkB(si));
       // System.out.println(checkAnagram(s1,s2));
        System.out.println(checkAnagram(s1,s2));
    }
        public static boolean checkB(String si){
            List<Character> lst = new ArrayList<>();
            Boolean bl = false;

            for (int i = 0; i < si.length(); i++) {
                char c = si.charAt(i);

               // System.out.println(lst);
                if (!lst.contains(c)) {
                    lst.add(c);
                    bl = true;

                }else {
                    bl = false;
                }
            }
            return bl;
        }
        public static boolean checkAnagram(String s1,String s2){
        boolean flag = false;
        char []c1 = s1.toCharArray();
            Arrays.sort(c1);
            System.out.println("Sorted C1"+ Arrays.toString(c1));
         char  []c2 = s2.toCharArray();
         Arrays.sort(c2);
            System.out.println("Sorted C2"+ Arrays.toString(c2));
         if(c1.length!=c2.length){
             flag = false;
             System.out.println("INSIDE FIRST IF");
         }
         if(Arrays.equals(c1,c2)){
             flag =true;
             System.out.println("INSIDE SECOND IF");
         }

        return flag;
        }


        }



