package exercise1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSummm {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 17;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    static int [] twoSum(int []arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            int diff = target - arr[i];

            if(map.containsKey(diff)){
                return new int [] {map.get(diff),i};
            }else{
                map.put(arr[i],i);
            }

        }
        return new int[]{0,0};

    }
}
