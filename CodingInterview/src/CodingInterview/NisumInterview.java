package CodingInterview;

import java.util.Arrays;

public class NisumInterview {
    /*Write a program to rotate an array by k positions
Given Input Array => 1,5,2,6,3,4,7
k = 2
Output Array => 4,7,1,5,2,6,3
Note: If the value of k is equals to 7, then the Array will come to it’s actual position*/

    public static void main(String []args) {

        int[] arr = {1, 5, 2, 6, 3, 4, 7};
        int k = 2;
        int temp =0;
        int last = arr.length-1;
        for (int i = 0; i <1; i++) {
        //    arr[i] = arr [last];
            arr[i+1] = arr [i];
          //  arr[last] = arr [i+1];
          //  arr[last] = arr [];

       //     arr[last] = arr[last-1];
//            arr[temp] = arr [i];
//            arr[last] = arr[i];

        }
        System.out.println(Arrays.toString(arr));

    }

}
