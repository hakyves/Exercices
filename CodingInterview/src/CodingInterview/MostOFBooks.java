package CodingInterview;

import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostOFBooks {

    public static void main(String [] args){
        String [] books = {"The Hobby by Eric","Whose Body by Allan", "The Cut by Jason","Winner by Allan"};
       // Map<Integer,String> map = new HashMap<>();
        List<String> lst = new ArrayList<>();
        int [] arr = new int [3];
        for(int i=0;i<arr.length;i++){

        }
        for(String str: books){
            lst.add(str);
            System.out.println("====================");
            System.out.println("BOOKS : "+str);
            System.out.println("====================");
            String [] words = str.split("\\s+");
            List<String> bks = new ArrayList<>();
            for(String word: words){
                bks.add(word);
                System.out.println("WORDS : "+bks);
            }
        }
        System.out.println(lst);


    }
}
