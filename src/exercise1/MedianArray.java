package exercise1;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MedianArray {
    public static void main(String []args){
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        System.out.println(arrayMedian(nums1,nums2));
    }
     static double arrayMedian(int []num1,int [] num2){
         DecimalFormat dc = new DecimalFormat("0.00");
        int n = num1.length;
        int m = num2.length;
        int x = n+m;
        double result = Double.valueOf(dc.format(0));
        int [] newArr = new int[x];
        for(int i=0;i<n;i++){
            newArr[i] = num1[i];
        }
        for(int i=0;i<m;i++){
            newArr[n+i] =num2[i];
        }
        Arrays.sort(newArr);
        if(x%2==0) {
             result = (newArr[x / 2 - 1] + newArr[x / 2])/2.0;
        }else{
            result = newArr[(x+1)/2-1];

            System.out.println("second IF:"+result);
        }
         return result;
     }

}
