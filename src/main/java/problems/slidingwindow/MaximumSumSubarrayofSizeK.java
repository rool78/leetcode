package problems.slidingwindow;

/*
Given an array of positive numbers and a positive number ‘k,’ find the maximum sum
of any contiguous subarray of size ‘k’.

Example 1:
Input: [2, 1, 5, 1, 3, 2], k=3
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].
 */
public class MaximumSumSubarrayofSizeK {

    static int[] in = {2, 1, 5, 1, 3, 2};

    public static void main(String[] args) {
        System.out.println(findMaxSumSubArrayBruteForce(3, in));
        System.out.println(findMaxSumSubArrayOptimal(3, in));
    }

    //  O(N∗K)
    public static int findMaxSumSubArrayBruteForce(int k, int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= k; j++) {
                sum += arr[j];
            }
            result = Math.max(sum, result);
        }
        return result;
    }
    // time complexity O(N), space O(1)
    // Fascinante forma de resolverlo...
    public static int findMaxSumSubArrayOptimal(int k, int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                currentSum += arr[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= arr[i - k];
                currentSum += arr[i];
            }
        }
        return Math.max(maxSum, currentSum);
    }

}
