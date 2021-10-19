package problems;

/*
Write a function that reverses a string. The input string is given as an array of characters s.

Example 1:
Input: s = ['h','e','l','l','o']
Output: ['o','l','l','e','h']

Example 2:
Input: s = ['H','a','n','n','a','h']
Output: ['h','a','n','n','a','H']

Constraints:
    1 <= s.length <= 105
    s[i] is a printable ascii character.

Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class ReverseString {

    //    static char[] s = {'h','e','l','l','o'};
//    static char[] s = {'H','a','n','n','a','h'};
    static char[] s = {'o', 'h'};


    public static void main(String[] args) {
        for (char c : s) {
            System.out.print(c + " ");
        }
        System.out.println();
        reverseString(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            if (s[left] != s[right]) {
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
            }
            left++;
            right--;
        }
    }
}
