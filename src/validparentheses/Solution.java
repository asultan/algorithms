package validparentheses;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkParentheses("{{}}()[()]")); // true
        System.out.println(checkParentheses("({{}}()[())]")); // false
        System.out.println(checkParentheses("[{{}}()[()]")); // false
        System.out.println(checkParentheses("[])(")); // false
        System.out.println(checkParentheses("{}{}{}()()()[][][]({[]})")); // true
    }

    private static boolean checkParentheses(String s) {
        final Stack<Integer> stack = new Stack();
        List<Integer> convertedParenthesesList = s.codePoints()
                .mapToObj(p -> (char) p)
                .map(Solution::convert)
                .collect(Collectors.toUnmodifiableList());

        for (int p : convertedParenthesesList) {
            if (p > 0) {
                stack.push(p);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                int pop = stack.pop();
                if (p + pop != 0) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    private static int convert(Character c) {
        switch(c) {
            case '(' : return 1;
            case '[' : return 2;
            case '{' : return 3;
            case ')' : return -1;
            case ']' : return -2;
            case '}' : return -3;
        }
        throw new RuntimeException("Invalid parentheses character: " + c);
    }
}
