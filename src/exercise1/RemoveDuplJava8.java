package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplJava8 {
    public static void main(String []args){
        List<Integer> withduplicates = Arrays.asList(10,10,29,20,20,34,20);
        System.out.println("With Duplicates: "+withduplicates);

        List<Integer> woDuplicates = withduplicates
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(woDuplicates);

    }

}
