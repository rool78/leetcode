package problems.algoexpert.medium;

public class LongestPalindromic {

    public static String longestPalindromicSubstring(String str) {
        if (str.isEmpty())
            return "";

        String result = String.valueOf(str.charAt(0));
        



        return result;
    }

    public static boolean isPalindrome(String str) {
        int p1 = 0;
        int p2 = str.length() - 1;
        while (p1 < p2) {
            if (str.charAt(p1) != str.charAt(p2))
                return false;
            p1++;
            p2--;
        }
        return true;
    }


}
