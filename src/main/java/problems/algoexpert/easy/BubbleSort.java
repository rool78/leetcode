package problems.algoexpert.easy;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        int counter = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    swap(i, i+1, array);
                }
            }
            counter++;
        }
        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
