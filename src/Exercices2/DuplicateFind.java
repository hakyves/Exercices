package Exercices2;

import java.util.HashMap;
import java.util.Map;

public class DuplicateFind {
    public static void main(String []args){
        String str = "programming";
        duplicate(str);

    }

    public static void duplicate(String str){
        Map<Character, Integer> mp = new HashMap<>();
        char [] charArray = str.toCharArray();

        for( char c: charArray){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)+1);
            } else {
                mp.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry: mp.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}
