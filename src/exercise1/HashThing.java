package exercise1;

import java.util.HashMap;

public class HashThing {
    public static void main(String []args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Louis");
        map.put(2,"Kaka");
        map.put(3,"King");
        map.put(4,"Chris");
        System.out.println(map);
        System.out.println(map.size());
        for(Integer i : map.keySet()){
            System.out.println("Key number: "+i+"Value :"+map.get(i));
        }

        for(String s : map.values()){
            System.out.println("===="+s);
        }

    }
}
