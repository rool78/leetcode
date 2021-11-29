package problems.algoexpert.easy;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j < 0 && array[j] > array[j - 1]) {
                swap(j, j - 1, array);
                j--;
            }
        }
        return array;
}

    private static void swap(int j, int i, int[] array) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
    }
