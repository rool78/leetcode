package problems.algoexpert.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    //Interesante
    public int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> hashTable = new HashMap<>();
        for (char c : string.toCharArray()) {
            hashTable.put(c, hashTable.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < string.length(); i++) {
            if (hashTable.get(string.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
