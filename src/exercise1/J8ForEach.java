package exercise1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class J8ForEach {
public static void main(String []args){
    List<Integer> lst = Arrays.asList(1,2,3,4);
    Stream<Integer> strm = lst.stream();
    //Using enhanced for
//    for(Integer x:lst){
//        System.out.println(x);
//    }
    //Using Iterator
//    Iterator<Integer> it = lst.iterator();
//    while(it.hasNext()){
//        System.out.println(it.next());
//
//    }
    //Using forEach
//    lst.forEach(System.out::println);
    strm.forEach(System.out::println);
}
}
