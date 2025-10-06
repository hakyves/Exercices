package exercise1;

public class CoinGame {
    public static void main(String []args){
        int n = 30;
        int [] arr = {1,5,10};
        for(int i =0;i<arr.length;i++){
            int max = arr[0];
            if(arr[i]>max){
                max = arr[i];
                if(n%max==0){
                    int res = n/max;
                }else{

                }

            }
        }

    }
}
