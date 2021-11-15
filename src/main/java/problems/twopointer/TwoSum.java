package problems.twopointer;

import java.util.HashMap;

//Basic two pointers
public class TwoSum {

    static int[] arr = {2,3,5,4,10};
    static int target = 6;

    public static void main(String[] args) {
        int [] result = twoSum(arr,target);
        for (int i: result) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            if (target == nums[left] + nums[right]) {
                return new int[] {left + 1, right + 1};
            }
            if (target > nums[left] + nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1,-1};
    }

    //Interesante forma de resolver el mismo problema con hashtable
    //El time complexity es O(N) y el space complexity O(N)
    public static int[] search(int[] arr, int targetSum) {
        HashMap<Integer, Integer> nums = new HashMap<>(); // to store numbers and their indices
        for (int i = 0; i < arr.length; i++) {
            if (nums.containsKey(targetSum - arr[i]))
                return new int[] { nums.get(targetSum - arr[i]), i };
            else
                nums.put(arr[i], i); // put the number and its index in the map
        }
        return new int[] { -1, -1 }; // pair not found
    }

}
