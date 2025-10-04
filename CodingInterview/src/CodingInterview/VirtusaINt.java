package CodingInterview;

import java.util.*;

public class VirtusaINt {

    //2 list of integers
    public static void main(String []args) {
        List<Integer> list1 = Arrays.asList(1, 3, 3, 5, 5, 6);
       // List<Integer> list2 = Arrays.asList(6, 9, 7, 8, 5, 6);
//
//        List<Integer> result = new ArrayList<>();
        int n = list1.size();
//        int n2 = list2.size();
//
        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(list1.get(i), i);
//        }
//        for (int j = 0; j < n2; j++) {
//            if (map.containsKey(j)) ;
//            result.add(map.get(j));
//        }
//        System.out.println(result);
        for(int i=0;i<n;i++){
            map.put(list1.get(i),map.get(list1.get(i))==null?1:map.get(list1.get(i))+1);
        }
        if(map.containsValue(2)){
            System.out.println(map);
        }
    }
}
