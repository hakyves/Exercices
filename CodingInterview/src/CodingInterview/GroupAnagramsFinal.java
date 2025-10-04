package CodingInterview;

import java.util.*;

public class GroupAnagramsFinal {
    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // System.out.println(g);
        System.out.println( groupAnagrams(strs));
//        List<String> ls = Arrays.asList("yve","haha","kuku");
//        System.out.println(ls);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {//

      Map<String,List<String>> map = new HashMap<>();
      for(String word: strs){
          char []chars = word.toCharArray();
          Arrays.sort(chars);
          String sortedword = new String(chars);
          if(!map.containsKey(sortedword)){
              map.put(sortedword,new ArrayList<>());
          }
          map.get(sortedword).add(word);
      }
      return new ArrayList<>(map.values());
    }
}

