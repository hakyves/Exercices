package CodingInterview;

import java.util.Arrays;

public class RotateArrayFinal {

    public int[] rotateA( int [] arr,int k){
       int n = arr.length;

       k=k%n;
       int [] temp = new int[n];
       for(int i=0;i<n;i++){
           temp[(i+k)%n] = arr[i];
       }
       return temp;

    }

    public static void main(String []args){
        //with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
        int [] array = {1,2,3,4,5,6,7};
        int x =3;

        RotateArrayFinal rot = new RotateArrayFinal();
        System.out.println(Arrays.toString(rot.rotateA(array,x)));
    }
}
