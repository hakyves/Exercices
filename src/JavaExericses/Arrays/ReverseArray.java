package JavaExericses.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String []args){
        int [] arr = {1,2,3,4,5};
        System.out.println("Reversed array with new space");
        System.out.println(Arrays.toString(reverseArr(arr)));
        System.out.println("Reversed array without new space");
        System.out.println(Arrays.toString(reverseArrNoNewSpace(arr)));
    }

    public static int [] reverseArr(int []num){
        int [] newArr = new int [num.length];
        for(int i= num.length-1,j=0;i>=0;i--){
            newArr[j++] = num[i];
        }
        return newArr;
    }
    public static int [] reverseArrNoNewSpace(int []num){

        for(int i=0;i<num.length/2;i++){
            int temp = num[i];
            num[i] = num[num.length-i-1];
            num[num.length-i-1] = temp;
        }
        return num;
    }
}
