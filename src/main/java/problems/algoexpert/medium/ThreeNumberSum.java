package problems.algoexpert.medium;

import java.util.*;

public class ThreeNumberSum {

    public static void main(String[] args) {
        List<Integer[]> out = threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0);
        for (Integer[] i : out) {
            System.out.println("===");
            System.out.println();
            for (int val : i) {
                System.out.print(val + " ");
            }
        }
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int sum = array[i] + array[left] + array[right];
                if (sum == targetSum) {
                    System.out.println("bingo");
                    result.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                } else if (sum > targetSum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }

    public static List<Integer[]> threeNumberSumInefficient(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        Set<Integer> hashtable = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            hashtable.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    hashtable.remove(array[i]);
                    hashtable.remove(array[j]);
                    int thirdValue = targetSum - (array[i] + array[j]);
                    if (hashtable.contains(thirdValue)) {
                        Integer[] match = new Integer[]{array[i], array[j], thirdValue};
                        Arrays.sort(match);
                        //Faltaria evitar add duplicates
                        result.add(match);
                    }
                    hashtable.add(array[i]);
                    hashtable.add(array[j]);
                }
            }
        }
        return result;
    }

}
