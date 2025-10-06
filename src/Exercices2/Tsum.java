package Exercices2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Tsum {

    public static void main(String []args){
        int [] num = {3,3};
        int target = 6;
        Tsum tsm = new Tsum();
        System.out.println(Arrays.toString(tsm.twoSumm(num,target)));
        ////////////////////////////
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println( list.get(0));
        System.out.println(list);
        ////////////////////////////
        int m = 3;
        int n  =2;
        double z = (double)m;
        double x = (double)n;
        double y=(x+z)/2;
        System.out.println("X : "+y);

    }

    public int [] twoSumm(int []arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int [] {map.get(diff),i};
            }
            map.put(arr[i],i);
        }

        return new  int[]{0,0};
    }

}
