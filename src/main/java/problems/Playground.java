package problems;

import java.util.HashMap;
import java.util.Map;

public class Playground {

    public static void main(String[] args) {
        System.out.println(solve(new String[] {"ccd"}
        , "kndnjdyzfvqocjidqtxjlsust"));
    }

    public static int solve(String[] words, String letters) {
        int maxLength = 0;
        for (String s : words) {
            int currentLength = getWordLength(s, letters);
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

    public static int getWordLength(String word, String letters) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : letters.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : word.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return 0;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        System.out.println("bingo " + word);
        return word.length();
    }

}
