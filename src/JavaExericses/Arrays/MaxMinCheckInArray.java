package JavaExericses.Arrays;

public class MaxMinCheckInArray {
    public static void main(String []args){
        int [] arr = {1,3,23,-2,43,2,5,24,78};
        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
