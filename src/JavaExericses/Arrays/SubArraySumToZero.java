package JavaExericses.Arrays;

import java.util.Arrays;

public class SubArraySumToZero {
    static Integer globalVariable ;
    public static void main(String []args){
        int [] arr = { 1, 2, -3, 4, 5, 6 };
        System.out.println(checkSum(arr));
        System.out.println("globalVariable :"+globalVariable);


    }
    public static boolean checkSum(int [] arr){
        boolean flag = false;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j++];
                if(sum == 0){
                    flag = true;
                }
            }
        }
        return flag;

    }

}
