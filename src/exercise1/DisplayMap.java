package exercise1;

import java.util.HashMap;
import java.util.Map;

public class DisplayMap {
    public static void main(String []args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Me");
        map.put(2,"You");
        map.put(3,"He");
        map.put(4,"She");


        System.out.println(map);
    }
}
