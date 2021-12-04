package problems.algoexpert.medium;

public class LongestPeak {
//[1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]

    public static void main(String[] args) {
        //System.out.println(longestPeak(new int[] {5, 4, 3, 2, 1, 2, 1}));
        System.out.println(4%9);
    }

    public static int longestPeak(int[] array) {
        if (array == null || array.length < 3) {
            return 0;
        }
        int longestPeak = 1;
        int currentLength = 1;
        boolean isUpHill = true;
        int endPointer = 1;
        for (int startPointer = 0; startPointer < array.length
                && endPointer < array.length; startPointer++) {
            if (isUpHill) {
                int a = array[startPointer];
                int b = array[endPointer];
                if (array[startPointer] == array[endPointer]) {
                    currentLength = 1;
                } else if (array[endPointer] > array[startPointer]) {
                    currentLength++;
                } else {
                    if (currentLength > 1) {
                        currentLength++;
                        isUpHill = false;
                    } else {
                        currentLength = 1;
                    }
                }
            } else {
                int a = array[startPointer];
                int b = array[endPointer];
                if (array[endPointer] == array[startPointer]) {
                    if (currentLength > 2) {
                        longestPeak = Math.max(longestPeak, currentLength);
                    }
                    currentLength = 1;
                    isUpHill = true;
                } else if (array[endPointer] < array[startPointer]) {
                    currentLength++;
                } else {
                    if (currentLength > 2) {
                        longestPeak = Math.max(longestPeak, currentLength);
                    }
                    currentLength = 1;
                    startPointer--;
                    endPointer--;
                    isUpHill = true;
                }
            }
            endPointer++;
        }
        if (!isUpHill && currentLength > 2) {
            longestPeak = Math.max(longestPeak, currentLength);
        }
        return longestPeak;
    }
}
