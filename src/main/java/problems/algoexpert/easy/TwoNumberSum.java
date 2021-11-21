package problems.algoexpert.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    //Bruten force O(N)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] + array[j] == targetSum) {
                    return new int[] {array[i],array[j]};
                }
            }
        }
        return new int[0];
    }

    // O(nlog(n) / space O(1)
    public static int[] optimusTwoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int p1 = 0;
        int p2 = array.length - 1;
        while (p1 < p2) {
            if (array[p1] + array[p2] == targetSum)
                return new int[] {array[p1], array[p2]};
            if (targetSum < array[p1] + array[p2])
                p2--;
            else
                p1++;
        }
        return new int[0];
    }

    //O(n) / O(n) space
    public static int[] hashtableTwoNumberSum(int[] array, int targetSum) {
        Set<Integer> hashtable = new HashSet<>();
        for (int num : array) {
            int potentialSol = targetSum - num;
            if (hashtable.contains(potentialSol)) {
                return new int[] {potentialSol, num};
            } else {
                hashtable.add(num);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] result = hashtableTwoNumberSum(new int[] {-1,-3,10,7,8}, -4);

        for (int i : result) {
            System.out.println(i);
        }


    }

}
