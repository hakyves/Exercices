package CodingInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        /*Two Sum function*/
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
         //   System.out.println(+i+" : "+diff);
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff));
                return new int[]{ map.get(diff),i};

            } else {
                map.put(nums[i], i);
            }

        }
        return new int[]{};
    }
}
