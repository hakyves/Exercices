package CodingInterview;

import java.util.*;

public class GroupAndReverse {
    public static void main(String[] args) {
        String input = "cat,ant,bat,tac,tar,rat";
        List<String> output = groupAndReverse(input);
        System.out.println(output);
    }

    public static List<String> groupAndReverse(String input) {
        String[] words = input.split(",");
        Map<String, List<String>> map = new TreeMap<>();

        // Group words by their sorted versions
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }

        // Convert map values to strings and add them to the output list
        List<String> output = new ArrayList<>();
        for (List<String> group : map.values()) {
            output.add(String.join(",", group));
        }

        return output;
    }
}

