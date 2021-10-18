package problems.twopointer;

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
}
