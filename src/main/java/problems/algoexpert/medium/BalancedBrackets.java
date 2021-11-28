package problems.algoexpert.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(balancedBrackets("(a)"));
    }

    public static boolean balancedBrackets(String str) {
        if (str.isEmpty())
            return true;

        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (!isOpenBracket(str.charAt(i))) {
                if (isBracket(str.charAt(i)) && stack.isEmpty()) {
                    return false;
                }
                else {
                    if (isBracket(str.charAt(i))) {
                        char c = stack.pop();
                        if (c != str.charAt(i))
                            return false;
                    }
                }
            } else {
                if (isOpenBracket(str.charAt(i))) {
                    stack.push(bracketsMap.get(str.charAt(i)));
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isBracket(char c) {
        return switch (c) {
            case '(', '{', '[', ')', '}', ']' -> true;
            default -> false;
        };
    }

    private static boolean isOpenBracket(char c) {
        return switch (c) {
            case '(', '{', '[' -> true;
            default -> false;
        };
    }

}
