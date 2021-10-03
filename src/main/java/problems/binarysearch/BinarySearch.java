package problems.binarysearch;

//The cost of this algorithm is O = log N worst case.
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 13;

        System.out.println("Solution: " + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, target);
    }
    //We could do it recursive very easily adding left and right params
    public static int binarySearch(int[] arr, int target/*, int left, int right*/) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + ((right - left) / 2);

            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            }

        }
        return -1;
    }
}
