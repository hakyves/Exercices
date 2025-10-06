package JavaExericses.Arrays;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String []args){
        int [] arr = {9,4,3,5,7,12,14};
        int n = arr[0];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
              n = arr[arr.length-2];

            }
        System.out.println(n);
        }

    }

