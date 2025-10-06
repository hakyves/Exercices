package JavaExericses.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonElementIn2Arrays {

    public static void main(String []args){
        int [] array1 = {1,2,3,4,5,6};
        int [] array2 = {1,7,8,9,1,6};

        List<Integer> nums = new ArrayList<>();

        for(int i = 0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){

                if(array1[i] == array2[j])
                    nums.add(array1[i]);

            }
        }
        System.out.println(nums);
    }
}
