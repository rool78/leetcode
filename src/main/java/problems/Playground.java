package problems;

import java.util.HashMap;
import java.util.Map;

public class Playground {

    public static void main(String[] args) {
        int [] arr = new int[] {1,1,3,2,3,3};
        int sol = 0;
        for (int i : arr) {
            sol = sol ^ i;
        }
        System.out.println(sol);

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            if (!countMap.containsKey(i)) {
                countMap.put(i, 1);
            } else {
                countMap.put(i, countMap.get(i));
            }
        }

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        System.out.println(majorityEntry.getKey());
    }
}
