package CodingInterview;

import java.util.Arrays;

public class RotatingArray {
    public static void main(String []arg){
//        int d =2;
//        int n =7;
          int k =2;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before Rotate: "+Arrays.toString(arr));
  //      System.out.println("After Rotate: "+Arrays.toString(rotate(arr, n, d)));
//        String str = "Geeks Gor Geeks";
//        System.out.println(str);
//        replaceAletterInString(str);
        rotateright(arr,k);

    }
    public static int[] rotate(int []arr,int n, int d){

     int [] temp = new int[n];
     int k=0;
     for(int i=d;i<n;i++){
         temp [k] = arr [i];
         k++;
     }
     for(int i=0;i<d;i++){
         temp[k] = arr[i];
         k++;
     }
     return temp;
    }
    public static void replaceAletterInString(String str){

       // String newStr ="";
        StringBuilder newStr = new StringBuilder(str);
        newStr.setCharAt(6,'F');
        int x =123;
        String newS ="";
        String s = String.valueOf(x);
        for(int i=s.length()-1;i>0;i--){
            char c = s.charAt(i);
            newS =""+c;

        }
        System.out.println("Reversed : "+newS);

        System.out.println(newStr);
    }
    public static void rotateright(int[] nums, int k) {
        int n = nums.length;
        int [] temp = new int[n];

        int d =0;

        for(int i=k;i<n;i++){
            temp[n-1] = nums[i];
            n--;
        }
//        for(int i=0;i<k;i++){
//            temp[d]=nums[i];
//            d++;
//        }



        System.out.println(Arrays.toString(temp)) ;
    }
}
