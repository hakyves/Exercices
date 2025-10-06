package JavaExericses.Arrays;

public class CheckContainsSpecArray {
    public static void main( String []args){
        int [] arr = {1,3,4,7,5};
        int item = 1;
        System.out.println(checkCont(arr,item));
    }
    public static boolean checkCont(int []num, int item){
       // boolean flag = false;
        for(int i=0;i<num.length;i++){
            if(num[i]==item){
                return true;
            }

        }
        return false;
    }
}
