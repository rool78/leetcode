package problems.algoexpert.easy;

import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {
//        System.out.println(isValidSubsequence(Arrays.asList(new int[] {1,2})));
        int maxValue = Integer.MIN_VALUE;
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        for (int i : sequence) {
            boolean match = false;
            while (!match && arrayIndex < array.size()) {
                if (i == array.get(arrayIndex)) {
                    match = true;
                }
                arrayIndex++;
            }
            if (!match)
                return false;
        }
        return true;
    }
}
