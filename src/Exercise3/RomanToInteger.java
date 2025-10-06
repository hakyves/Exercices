package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String []args){
        System.out.println(romanToInt("DC"));

    }
    public static int romanToInt(String s) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int i = 0;
        int sum =0;
        int prev = 0;
        for(char ch:s.toCharArray()){
           // Ints.indexOf(arr, t);

            int curr = map.get(ch);
            sum += curr;
//            if(curr<prev){
//                sum = curr - prev;
//            }
            prev = curr;

        }
        return sum;

    }
}
