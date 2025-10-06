package exercise1;

import java.util.*;

public class RemoveDupl {

    public static void main(String []args){
        List<Integer> lst = Arrays.asList(10,10,29,20,20,34,20);
        RemoveDupl rem  = new RemoveDupl();
        System.out.println(rem.removelis(lst));


    }
    public List<Integer> removelis(List<Integer> arr){
       List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                continue;
            }else{
                map.put(arr.get(i),i);
                result.add(arr.get(i));
            }

        }
        return result;

    }
}
