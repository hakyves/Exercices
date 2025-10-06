package JavaExericses.Arrays;

import java.util.Arrays;

public class RemoveElementInArray {
    public static void main(String []args){
        int [] arr = {2,3,1,4,7,5};
        int index = 0;
        System.out.println(Arrays.toString(removEl(arr,index)));

    }
    public static int [] removEl(int [] num, int index){

        int [] newArr = new int [num.length-1];

        if(num == null||index<0 ||index>=num.length){
            return num;
        }
        for(int i=0, k =0;i< num.length;i++){
            if(i== index){
                continue;
            }else{
                newArr[k++] = num[i];
            }
        }
        return newArr;
    }
}
