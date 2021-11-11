package problems.string.easy;

import java.util.ArrayList;
import java.util.List;

/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists
of lowercase and uppercase English letters.
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

Example 1:
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
 */
public class SortingtheSentence {

    static String sentence = "QcGZ4 TFJStgu3 HvsRImLBfHd8 PaGqsPNo9 mZwxlrYzanuVOUZoyNjt1 fzhdtYIen6 mV7 LKuaOtefsixxo5 pwdEK2";

    public static void main(String[] args) {
        System.out.println(sortSentence(sentence));
    }

    static String sortSentence(String s) {
        StringBuilder sol = new StringBuilder();
        char[] arr = s.toCharArray();
        String[] solArr = new String[10];
        int startWord = 0;
        int endWord;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                endWord = i;
                solArr[Character.getNumericValue(arr[i])] = s.substring(startWord, endWord);
                startWord = endWord + 1;
            }
        }
        for (int i = 1; i < solArr.length; i++) {
            if (solArr[i] != null) {
                sol.append(solArr[i].trim());
            }
            if (i + 1 < solArr.length && solArr[i + 1] != null) {
                sol.append(" ");
            }
        }
        return sol.toString();
    }

}
