package CodingInterview;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementFinal {
    public static void main(String []args){
        List<String> strings = Arrays.asList("ab","bc","xy","ab","xy");

        System.out.println("List before : "+strings);
       List<String> noduplicates = strings.stream()
               .distinct()
               .collect(Collectors.toList());

        System.out.println("After removing duplicates:");
        System.out.println(noduplicates);


    }
}
