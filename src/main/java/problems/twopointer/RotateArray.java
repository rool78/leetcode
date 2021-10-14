package problems.twopointer;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

 */

public class RotateArray {

    static int[] arr = {1, 2, 3, 4, 5, 6, 7};
    static int k = 3;

    public static void main(String[] args) {
        rotate(arr, k);
        System.out.println();
        for (int i: arr) {
            System.out.print(" " + i);
        }
    }
//  O(n^2)
    public static void rotate(int[] nums, int k) {
        int[] out = new int[nums.length];

        //brute force
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == nums.length - 1) {
                    out[0] = nums[nums.length - 1];
                } else {
                    out[j + 1] = nums[j];
                }
            }
            nums = out.clone();
        }

        nums = out;

        System.out.println();
        for (int i: out) {
            System.out.print(" " + i);
        }
    }

}
