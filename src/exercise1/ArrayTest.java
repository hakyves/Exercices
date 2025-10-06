package exercise1;

public class ArrayTest {
    public static void main(String []args){
        int [] arr = {1,2,3,4,5};
        int target =5;
        System.out.println( arrayIndex(arr,target));

    }
    static int arrayIndex(int []arr,int target){
        int n =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
