package problems;

/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and
initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"

Constraints:
    1 <= s.length <= 5 * 104
    s contains printable ASCII characters.
    s does not contain any leading or trailing spaces.
    There is at least one word in s.
    All the words in s are separated by a single space.
 */

public class ReverseWordsinaStringIII {

    static String s = "Hola que tal";

    public static void main(String[] args) {
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right;
        int arrPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' || i == arr.length - 1) {
                //endWord = i;
                arrPos = i;
                right = arr[i] == ' ' ? arrPos - 1 : arrPos;
                while (left < right) {
                    if (arr[left] != arr[right]) {
                        char tmp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = tmp;
                    }
                    left++;
                    right--;
                }
                left = arrPos + 1;
            }
        }
        return new String(arr);
    }
}
