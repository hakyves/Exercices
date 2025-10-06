package Exercices2;

import java.util.Stack;

public class ValidStringPar {
    public static void main(String[] args) {
        String str = "([{}])";
        System.out.println(isValid(str));

    }

    static boolean isValid(String str) {
        if (str.length() % 2 != 0 || str.isEmpty()) {
            return false;
        }
        Stack<Character> charStack = new Stack<>();
        for (char c : str.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else if (c == ')' && !charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop();

            } else if (c == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
                charStack.pop();
            } else if (c == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
                charStack.pop();
            }else{
                charStack.push(c);
            }

        }
        return charStack.isEmpty();
    }
}
