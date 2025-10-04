package arraysExcercises;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String []args){
        int [] num = {10, 5, 10};
        System.out.println(secondElement(num));

    }
    public static int secondElement(int []arr){
        int result =0;
        int max = 0;
        Arrays.sort(arr);

        for(int i=0;i< arr.length;i++){
            if(i==arr.length-2){
                 result = arr[i];
            }

        }

        return result;
    }

}
