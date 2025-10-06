package JavaExericses.Arrays;

public class FindIndexArray {

    public static void main (String [] args){
        int [] arr = {1,3,4,9,6};
        int element = 6;
        System.out.println(checkIndex(arr,element));

    }

    public static int checkIndex(int []num, int e){
        int ind = 0;
        for(int i=0;i<num.length;i++){
            if(num[i]==e){
                ind = i;
            }

        }
        return ind;
    }
}
