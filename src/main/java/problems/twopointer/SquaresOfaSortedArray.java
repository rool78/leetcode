package problems.twopointer;
/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each
number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Constraints:
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums is sorted in non-decreasing order.

Follow up: Squaring each element and sorting the new array is very trivial, could you find an
O(n) solution using a different approach?
 */
public class SquaresOfaSortedArray {

    static int[] arr = {-4,-1,0,3,10};

    public static void main(String[] args) {
        int [] sol = sortedSquares(arr);

        for (int i: sol) {
            System.out.print(i + "   ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int [] numsSquare = new int[nums.length];
        int left, right = 0, index = 0;
        // 1-buscar el valor de right (primer elemento positivo)
        while (right < nums.length && nums[right] < 0) {
                right++;
        }
        left = right - 1;
        //2-Iterar sobre el array mientras left y right esten en rango
        while (right < nums.length && left >= 0) {
            if (Math.pow(nums[right], 2) < Math.pow(nums[left], 2)) {
                numsSquare[index] = (int) Math.pow(nums[right], 2);
                index++;
                right++;
            } else {
                numsSquare[index] = (int) Math.pow(nums[left], 2);
                index++;
                left--;
            }
        }
        //3-Add elementos restantes en left
        while (left >= 0) {
            numsSquare[index] = (int) Math.pow(nums[left], 2);
            index++;
            left--;
        }
        //4-Add elementos restantes en right
        while (right < nums.length) {
            numsSquare[index] = (int) Math.pow(nums[right], 2);
            index++;
            right++;
        }
        return numsSquare;
    }
}
