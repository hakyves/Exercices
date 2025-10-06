package Exercise3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class MainClass {
    public static void main(String []args){
//        Employee[] empArr = new Employee[4];
//        empArr[0] = new Employee(5,"John");
//        empArr[1] = new Employee(9,"Paul");
//        empArr[2] = new Employee(1,"Amit");
//        empArr[3] = new Employee(10,"Ame");
//        Arrays.sort(empArr);
//        System.out.println("sorted:"+Arrays.toString(empArr));
        System.out.println(findDay(04,30,1985));
        System.out.println(isAnagram("atc","cat"));
       //int  a[] = { 5, 4, 6, 1, 3, 2, 7, 8, 9}; int K = 5;
       int  a[] = { 5, 4, 6, 1, 3, 2, 7, 8, 9}; int K = 7;
        System.out.println( findIndex(a,K));

    }
    public String decode(String input){
        char [] mychars = input.toCharArray();
        Arrays.sort(mychars);
        return null;
    }

        public static String findDay(int month, int day, int year) {
            LocalDate localDate = LocalDate.of(year,month,day);
            DayOfWeek dw = localDate.getDayOfWeek();
            return dw.toString();

    }
    public static boolean isAnagram(String a, String b){
        char [] ar = a.toCharArray();
        char [] br = b.toCharArray();
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        Arrays.sort(br);
        System.out.println(Arrays.toString(br));
      return   Arrays.equals(ar,br);
    }
    public static int findIndex(int []arr,int k){
        int result = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i] == k){
               result = i;

            }
        }
        return result;
    }



}
