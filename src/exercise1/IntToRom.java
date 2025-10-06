package exercise1;

import java.util.HashMap;
import java.util.Map;

public class IntToRom {

//    public static int intToRomans(){
//
//
//
//
//    }

    public static void main(String []args){
        Map<String,Integer> mp = new HashMap<>();
        int n =0;
        mp.put("I",1);
        mp.put("V",5);
        mp.put("X",10);
        mp.put("L",50);
        mp.put("C",100);
        mp.put("D",500);
        //  mp.put("M",1000);

//        for(Map.Entry<String, Integer> set : mp.entrySet()) {
//            System.out.println(set.getKey()+": "+set.getValue());
//        }
//        mp.forEach(
//            (key, value) ->
//                    System.out.println(key + ": :" + value)
//        );
        mp.entrySet().stream().forEach(x->
                System.out.println(x.getKey()+":::"+x.getValue()));

    }
}
