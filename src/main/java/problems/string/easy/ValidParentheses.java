package problems.string.easy;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
input string is valid.
An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Example 1:
Input: s = "()"
Output: true

 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()))"));
    }

    static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        if (arr.length % 2 != 0 || !isOpenParenthesis(arr[0])) return false;

        for (int i = 0; i < arr.length; i++) {
            if (isOpenParenthesis(arr[i])) {
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty() || !isPair(stack.pop(), arr[i])) return false;
            }
        }
        return stack.isEmpty();
    }

    static boolean isOpenParenthesis(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    static boolean isPair(char a, char b) {
        return switch (a) {
            case '(' -> b == ')';
            case '[' -> b == ']';
            case '{' -> b == '}';
            default -> false;
        };
    }

}
