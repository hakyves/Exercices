package JavaExericses.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 5, 7, 12, 14};
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            nums.add(arr[i]);
        }
        System.out.println("==From Array==");
        System.out.println(Arrays.toString(arr));
        System.out.println("==From ArrayList==");
        System.out.println(nums);
    }
}
