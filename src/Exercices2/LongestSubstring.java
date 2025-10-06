package Exercices2;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String []args){
        String str = "abcdabcbb";
        System.out.println(longestSubString(str));

    }

    static int longestSubString(String str){
        int i =0;
        int j =0;
        int max =0;
        HashSet<Character> hash_set = new HashSet<>();
        while(j< str.length()){
            if(!hash_set.contains(str.charAt(j))){
                hash_set.add(str.charAt(j));
                j++;
                max =Math.max(hash_set.size(), max);
            } else{
                hash_set.remove(str.charAt(i));
                i++;
            }

        }
      return max;

    }
}
