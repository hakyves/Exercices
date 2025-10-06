package JavaExericses.Arrays;

import java.util.Arrays;

public class ArraySort {

    public static void main(String []args){
        int [] arr = {2,1,3,4};
        System.out.println("Before Sorting");
        System.out.println("==============");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Default Method");
        System.out.println("==============");
        System.out.println(Arrays.toString(arr));
        System.out.println("Coded Method");
        System.out.println("==============");
        System.out.println(Arrays.toString(sortarr(arr)));
    }

    public static int [] sortarr(int []num){

        int [] newNum = new int[num.length];

        for(int i=0;i<num.length;i++){
           for(int j=i+1;j<num.length;j++){
               int temp =0;
               if(num[i]>num[j]){
                   temp = num[i];
                   num[i] = num[j];
                   num[j] = temp;
               }
           }
        }
        return num;
    }
}
