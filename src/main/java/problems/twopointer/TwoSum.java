package problems.twopointer;

//Basic two pointers
public class TwoSum {

    static int[] arr = {2,3,4};
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
        int right = nums.length - 1;
        while (left <= right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum < target) {
                if (nums[left + 1] + nums[right] > currentSum) {
                    left += 1;
                }
            } else if (currentSum > target) {
                if (nums[left] + nums[right - 1] < currentSum) {
                    right -= 1;
                }
            } else {
                return new int[] {left, right};
            }
        }
        return new int[] {right, left};
    }
}
