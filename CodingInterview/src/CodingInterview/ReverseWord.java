package CodingInterview;

public class ReverseWord {
    public static void main(String [] args){
        String input = "Lee***me**";
        String output = removeAsterisks(input);
        System.out.println(output);
    }

    public static String removeAsterisks(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != '*') {
                sb.append(c);
               // sb.append('*');
            }
        }
        return sb.toString();

    }
}
