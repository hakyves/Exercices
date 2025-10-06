package JavaExericses.Arrays;

import java.util.Arrays;

public class InsertElementArray {
    public static void main(String []args){

        int index = 2;
        int newValue = 1;
        int [] arr = {10,20,30,40,50};
        System.out.println("======Before Inserting=======");
        System.out.println(Arrays.toString(arr));

        for(int i= arr.length-1;i>index;i--){
            arr[i] = arr[i-1];
        }
       arr[index] = newValue;
        System.out.println("===After Inserting=======");
        System.out.println(Arrays.toString(arr));


    }
}
