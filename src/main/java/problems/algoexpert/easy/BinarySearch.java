package problems.algoexpert.easy;

public class BinarySearch {

    public class Program {
        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (target == array[mid])
                    return mid;
                if (target > array[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return -1;
        }
    }
}