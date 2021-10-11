package problems.binarysearch;

public class SearchInsertPosition {


    static int[] arr = {1,3};
    static int target = 2;

    public static void main(String[] args) {
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target) return mid;
            if (target > nums[mid]) {
                left = mid + 1;
                index = left;
            } else if (target < nums[mid]) {
                right = mid - 1;
                index = mid;
            }
        }
        return index;
    }
}
