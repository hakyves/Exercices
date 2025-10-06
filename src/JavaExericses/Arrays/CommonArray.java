package JavaExericses.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonArray {
    public static void main(String []args){
        int [] arr ={1,2,3,4,8,9};
        int []num ={3,4,5,6,1};
        System.out.println(commonArray(arr,num));

    }

    public static List<Integer> commonArray(int []arr,int []num){
        List<Integer> nums = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< num.length;j++){
                if(arr[i] == num[j]){
                    nums.add(arr[i]);
                }
            }
        }
        return nums;
    }
}
