package JavaExericses.Arrays;

import java.util.Arrays;

public class DimensionArray {

    public static void main(String []args) {
        int spec = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9};


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == spec){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }


    }


}
