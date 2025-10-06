package JavaExericses.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CopyArray {
    public static void main(String []args){
        int [] arr = {1,3,2,4,5};
        System.out.println("Original Array : "+Arrays.toString(arr));
        System.out.println("Copy Array : "+Arrays.toString(copyArr(arr)));

    }

    public static int [] copyArr(int []num){

        int [] copyArray = new int[num.length];

        for(int i=0;i<num.length;i++){
            copyArray[i] = num[i];
        }
        return copyArray;
    }

}
