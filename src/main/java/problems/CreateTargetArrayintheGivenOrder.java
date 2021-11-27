package problems;


import java.util.ArrayList;
import java.util.List;

/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:
    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

Example 1:
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */
public class CreateTargetArrayintheGivenOrder {

    public static void main(String[] args) {
        int[] sol = createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});

        for (int i : sol) {
            System.out.println(" " + i);
        }


    }

    static int subtractProductAndSum(int n) {
        int result = 0;


        return result;

    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] sol = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sol[index[i]] = nums[index[i]];
        }
        return sol;
    }
}
