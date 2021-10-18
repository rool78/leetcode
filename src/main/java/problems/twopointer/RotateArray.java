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

    static int[] input = {1, 2, 3, 4, 5, 6, 7};
    static int k = 3;

    public static void main(String[] args) {
        for (int i : input) {
            System.out.print(" " + i);
        }
        System.out.println();
        rotate(input, k);
        for (int i : input) {
            System.out.print(" " + i);
        }

    }

    public static void rotate(int[] nums, int k) {
        if (nums.length < 1) {
            return;
        }
        int[] out = new int[nums.length];
        int outIndex = 0;
        int trick = k % nums.length; //el truco para obtener la cantidad de numero que tienen que ir al principio del array

        for (int i = nums.length - trick; i < nums.length; i++) {
            out[outIndex++] = nums[i];
        }
        for (int i = 0; i < nums.length - trick; i++) {
            out[outIndex++] = nums[i];
        }
        for (int i = 0; i < out.length; i++) {
            nums[i] = out[i];
        }

    }

}
