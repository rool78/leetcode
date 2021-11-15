package problems.twopointer;

/*
Given two strings containing backspaces (identified by the character ‘#’),
check if the two strings are equal.

Example 1:
Input: str1="xy#z", str2="xzz#"
Output: true
Explanation: After applying backspaces the strings become "xz" and "xz" respectively.

Example 2:
Input: str1="xy#z", str2="xyz#"
Output: false
Explanation: After applying backspaces the strings become "xz" and "xy" respectively.

Example 3:
Input: str1="xp#", str2="xyz##"
Output: true
Explanation: After applying backspaces the strings become "x" and "x" respectively.
In "xyz##", the first '#' removes the character 'z' and the second '#' removes the character 'y'.

Example 4:
Input: str1="xywrrmp", str2="xywrrmu#p"
Output: true
Explanation: After applying backspaces the strings become "xywrrmp" and "xywrrmp" respectively.
 */
public class ComparingStringsContainingBackspaces {

    public static void main(String[] args) {
        System.out.println(compare("xy#z", "xzz#"));
    }

    public static boolean compare(String str1, String str2) {
        int p1;
        int p2 = str2.length() - 1;
        int backspaces = 0;
        for (p1 = str1.length() - 1; p1 >= 0 ; p1--) {
            if (str1.charAt(p1) == '#') {
                backspaces++;
                continue;
            }
            if (backspaces > 0) {
                p1 -= backspaces;
                backspaces = 0;
            }
            while (p2 >= 0 && str2.charAt(p2) == '#') {
                backspaces++;
                p2--;
            }
            if (backspaces > 0) {
                p2 -= backspaces;
                backspaces = 0;
            } else {
                p2--;
            }
            if (str1.charAt(p1) != str2.charAt(p2)) {
                return false;
            }
        }
        System.out.println(p1);
        System.out.println(p2);
        return p1 == p2;
    }
}
