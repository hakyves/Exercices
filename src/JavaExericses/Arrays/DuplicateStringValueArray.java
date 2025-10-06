package JavaExericses.Arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicateStringValueArray {

    public static void main(String []args){
        String [] arr = {"apple","peach","orange","grape","orange"};
        int [] arr1 = {2,7,9,7,5,9};
        List<String> lists = new ArrayList<>();
        int i=0,j=i+1;


        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    lists.add(arr[i]);
                }
            }

        }
        System.out.println("The list : "+lists);
    }
}
