package problems.algoexpert.medium;

public class LongestPalindromic {

    public static String longestPalindromicSubstring(String str) {
        int[] currentLongest = new int[] {0, 1};
        for (int i = 1; i < str.length(); i++) {
            int[] odd = getSubstringPalindrome(str, i - 1, i + 1);
            int[] even = getSubstringPalindrome(str, i - 1, i);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            currentLongest = longest[1] - longest[0] > currentLongest[1] - currentLongest[0]
                    ? longest : currentLongest;
        }
        return str.substring(currentLongest[0], currentLongest[1]);
    }

    private static int[] getSubstringPalindrome(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) != str.charAt(right)) {
                break;
            }
            left++;
            right--;
        }
        return new int[] {left, right - 1};
    }

}
