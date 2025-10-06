package JavaExericses.Arrays;

import java.util.Arrays;

public class removeDuplecateElementArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
        System.out.println(Arrays.toString(removeDupl(arr)));

    }

    public static int[] removeDupl(int[] num) {
        int count = 0;
        int[] newArr = new int[num.length - count];
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {
                if (num[i] == num[j]) {
                    count++;
                    System.out.println(count);
                    continue;
                } else {
                    System.out.println(newArr[i]);
                    newArr[i] = num[i];
                }
            }

        }
        return newArr;
    }
}
