package problems.algoexpert.medium;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array) {
        if (array.length < 2) {
            return true;
        }
        int left = 0;
        int right = 1;
        boolean isIncreasing = false;
        while (right < array.length) {
            if (array[left] < array[right]) {
                isIncreasing = true;
                break;
            } else if (array[left] > array[right]) {
                isIncreasing = false;
                break;
            } else {
                left++;
                right++;
            }
        }
        if (right == array.length) {
            return true;
        }
        left = 0;
        right = 1;
        while (right < array.length) {
            if (isIncreasing && array[left] > array[right]) {
                return false;
            } else if (!isIncreasing && array[left] < array[right]) {
                return false;
            }
            left++;
            right++;
        }
        return true;
    }
}
