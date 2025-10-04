package CodingInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MphasisInt {

    public static void main(String []args){

        List<String> strings = Arrays.asList("apple","apple","apple","banana","orange","orange");

//        Map<String,Long> even = strings.stream()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue())
//                .ifPresent(System.out::println);
        /*
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet()
      .stream()
      .max(Map.Entry.comparingByValue())
      .ifPresent(System.out::println);
         */

       // System.out.println(even);


//        boolean checkeven(int x){
//            boolean flag = false;
//            if(x%2==0){
//                flag = true;
//            }
//            flag = false;
//        }

    }
}
