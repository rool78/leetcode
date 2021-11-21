package problems.algoexpert.easy;

public class PalindromeCheck {

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
