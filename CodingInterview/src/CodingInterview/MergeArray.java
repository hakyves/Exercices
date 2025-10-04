package CodingInterview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MergeArray {
    public static void main(String []arg){
        int []a = {1,2,3};
        int []b ={4,5};
        int a1 = a.length;
        int b1 = b.length;

        int c1 = a1+b1;
        int [] c= new int[c1];

        System.arraycopy(a,0,c,0,a1);
        System.arraycopy(b,0,c,a1,b1);
        System.out.println(Arrays.toString(c));
        int len = c.length;
        double result =0;
        for(int i=0;i<len;i++){
            if(len%2==0){
                 result = (c [len/2] + c [((len/2)+1)])/2;
                 System.out.println(" IN IF:"+result);
            }else{
                System.out.println(" ELSE : "+result);
                 result = c[(len/2)+1];
            }
        }
        System.out.println(+result);
        // print distinct names
        List<String> lst = new ArrayList<>();
        lst.add("Dido");
        lst.add("Nido");
        lst.add("Dido");
        lst.add("Xido");
        System.out.println(lst);
        System.out.println("================");
        System.out.println("====    USING Java 7 =======");
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(Integer i:ints){
            if(i%2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        System.out.println(even);
        System.out.println(odd);
        System.out.println("++++USING Java 8+++++");
        List<Integer> evenJava8 = ints.stream().filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> oddJava8 = ints.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.out.println(evenJava8);
        System.out.println(oddJava8);
        System.out.println("======Group by========");
        System.out.println(ints.stream().collect(Collectors.groupingBy(i->i%2==0)));
        System.out.println("======Partition by========");
        System.out.println(ints.stream().collect(Collectors.partitioningBy(i->i%2==0)));
        Map<Object,List<Integer>> map = ints.stream().collect(Collectors.groupingBy(i->i%2==0));
        System.out.println("++++=Using Map=+++++");
        System.out.println(map);
        System.out.println("++++++Palindrom+++++++");
        String str ="oppo";
        String reversed ="";
        boolean ans = false;
        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed + str.charAt(i);
        }
        if(str.equals(reversed)){
            ans = true;
        }else{
            ans = false;
        }
        System.out.println(reversed);
        System.out.println(ans);
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String,Long> mapcount = stationeryList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("== Counting Distinct ====");
        System.out.println(mapcount);

        List<Double> numbers = Arrays.asList(2.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        numbers
                .stream()
                .sorted(Comparator.naturalOrder()).forEach(System.out::println);




    }

}
