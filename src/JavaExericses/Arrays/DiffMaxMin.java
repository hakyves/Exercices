package JavaExericses.Arrays;

import java.util.Arrays;

public class DiffMaxMin {

    public static void main(String [] args){
        int [] arr = {2,4,5,7,4,3,1};
        System.out.println("Before sorting : "+Arrays.toString(arr));
       // Arrays.sort(arr);
        int temp =0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        int diff = arr[arr.length-1] - arr[0];
        System.out.println("After sorting : "+Arrays.toString(arr));
        System.out.println("Difference :"+diff);
    }
}
