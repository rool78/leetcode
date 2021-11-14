package problems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
Given a string, find the length of the longest substring in it with no more than K distinct characters.

Example 1:
Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2' distinct characters is "araa".

Example 2:
Input: String="araaci", K=1
Output: 2
Explanation: The longest substring with no more than '1' distinct characters is "aa".

Example 3:
Input: String="cbbebi", K=3
Output: 5
Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".

Example 4:
Input: String="cbbebi", K=10
Output: 6
Explanation: The longest substring with no more than '10' distinct characters is "cbbebi".
 */
public class LongestSubstringwithmaximumKDistinctCharacters {

    public static void main(String[] args) {
        System.out.println("hola".substring(0,1));
        System.out.println(findLength("cbbebi", 10));
    }

    //Este algoritmo tiene un Space complexity O(1), habria que ver si cubre todos los casos de test
    public static int findLength(String str, int k) {
        int maxLength = 0;
        int differentCharacters = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            if (!str.substring(windowStart, windowEnd).contains(String.valueOf(str.charAt(windowEnd)))) {
                differentCharacters++;
            }
            if (differentCharacters <= k) {
                maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
            } else {
                if (!str.substring(windowStart + 1, windowEnd).contains(String.valueOf(str.charAt(windowStart)))) {
                    differentCharacters--;
                }
                    windowStart++;
            }
        }
        return maxLength;
    }

    /*
    Elegant HashMap Solution
     */

    //TODO Tengo la idea, implementarlo en unos dias para practicarlo, recordar "getOrDefault"

    //Es muy interesante observar como el costo de este algoritmo es O(N+N) -> O(N). El bucle for tiene un coste N,
    //siendo N el size del string, el bucle while no esta incrementado el coste a N x N ya que solo procesa cada valor
    //nsimo del bucle for una vez manteniendo el coste O(N). El bucle while desplaza el comienzo de la ventana una
    //posicion a la derecha.

    //Space complexity O(K)
    public static int findLengthHashMap(String str, int k) {
        if (str == null || str.length() == 0)
            throw new IllegalArgumentException();

        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        // in the following loop we'll try to extend the range [windowStart, windowEnd]
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);
            // shrink the sliding window, until we are left with 'k' distinct characters in the frequency map
            while (charFrequencyMap.size() > k) {
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                windowStart++; // shrink the window
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
        }

        return maxLength;
    }

}
