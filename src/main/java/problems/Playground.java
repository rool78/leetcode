import java.util.*;

public class Playground {

    public static void main(String[] args) {
//        System.out.println(solve([[1,4],[3,5],[6,9],7,9}}));
    }

    public static int solve(int[][] intervals) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : intervals) {
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        int mostFrequentNum = Integer.MAX_VALUE;
        int frequency = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > frequency) {
                frequency = entry.getValue();
                mostFrequentNum = Math.min(mostFrequentNum, entry.getKey());
            }
        }
        return mostFrequentNum;
    }
}




