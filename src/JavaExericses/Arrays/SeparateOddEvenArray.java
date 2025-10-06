package JavaExericses.Arrays;

import java.util.Arrays;

public class SeparateOddEvenArray {

    public static void main(String []args){
        int [] arr = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        int temp =0;
        System.out.println("Before separating  : "+ Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]%2!=0 && arr[j]%2==0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After separating Even and Odd : "+Arrays.toString(arr));
    }
}
