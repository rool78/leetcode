package problems.slidingwindow;

/*
Problem Statement#

Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose
sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.

 Example 1:
Input: [2, 1, 5, 2, 3, 2], S=7
Output: 2
Explanation: The smallest subarray with a sum greater than or equal to '7' is [5, 2].

Example 2:
Input: [2, 1, 5, 2, 8], S=7
Output: 1
Explanation: The smallest subarray with a sum greater than or equal to '7' is [8].

Example 3:
Input: [3, 4, 1, 1, 6], S=8
Output: 3
Explanation: Smallest subarrays with a sum greater than or equal to '8' are [3, 4, 1]
or [1, 1, 6].
 */
public class SmallestSubarraywithagivensum {

    public static void main(String[] args) {
        System.out.println(findMinSubArraySecondTry(7, new int[]{2, 1, 5, 2, 3, 2}));
    }
//  Mi implementacion regulera
    public static int findMinSubArray(int S, int[] arr) {
        int windowStart = 0;
        int windowEnd = 0;
        int currentSum = 0;
        while (currentSum < S) {
            currentSum += arr[windowEnd++];
        }
        int sol = windowEnd + 1;
        while (windowStart < windowEnd) {
            if (currentSum >= S) {
                sol = Math.min(sol, windowEnd - windowStart);
                currentSum -= arr[windowStart];
                windowStart++;
            } else {
                if (windowEnd < arr.length) {
                    currentSum += arr[windowEnd];
                    windowEnd++;
                } else {
                    break;
                }
            }
        }
        return sol;
    }

    //Cost O(N+N) -> O(N)
    public static int findMinSubArraySecondTry(int S, int[] arr) {
        int minSubArray = Integer.MAX_VALUE;
        int windowStart = 0;
        int currentWindowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];
            while (currentWindowSum >= S) {
                minSubArray = Math.min(minSubArray, windowEnd - windowStart + 1);
                currentWindowSum -= arr[windowStart++];
            }
        }
        return minSubArray == Integer.MAX_VALUE ? 0 : minSubArray;
    }
}
