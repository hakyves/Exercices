package CodingInterview;

import java.util.HashMap;
import java.util.Map;

public class TTTTT {

    public static void main(String []args){
        int arr[] = {5,10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        System.out.println(countFreq(arr,n));
    }

    static Map<Integer,Integer> countFreq(int arr[], int n){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
           map.put(arr[i],map.get(arr[i])==null?1:map.get(arr[i])+1);
        }
//        int max =0;
//        for(int i=0;i<map.size();i++){
//
//            if(map.get(arr[i])>max){
//                max = arr[i];
//
//            }
//            System.out.println("M : "+max);
//
//        }
//        System.out.println("Max :"+max);
        return map;
    }


}
