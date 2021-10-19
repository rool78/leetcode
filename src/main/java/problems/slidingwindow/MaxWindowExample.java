package problems.slidingwindow;

public class MaxWindowExample {

    static int[] arr = {2,3,4,1,5,7};
    static int windowSize = 3;

    public static void main(String[] args) {
        System.out.println(maxSumSubarray(arr, windowSize));
    }

    public static int maxSumSubarray(int [] arr, int windowSize) {
        int maxSum = -1;
        int start = 0;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (i - start + 1 == windowSize) {
                maxSum = Math.max(maxSum, currSum);
                currSum -= arr[start];
                start++;
            }
        }
        return maxSum;
    }

}
