package JavaExericses.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateInArray {
    public static void main(String []args){
        int []arr = {1, 2, 5, 5, 6, 6, 7, 2};
        System.out.println("Original ");
        findDuplicate(arr);

        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }
    public static void findDuplicate(int []num){
       // int [] newArr = new int[2];
        List<Arrays> arraylists = new ArrayList<>();
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if((num[i]==num[j]) && (i!=j))

                    System.out.println(num[j]);

            }
        }

    }

}
