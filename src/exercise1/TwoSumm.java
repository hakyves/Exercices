package exercise1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumm {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 13;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
       static  int [] twoSum(int []nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int [] {0,0};
    }
}
