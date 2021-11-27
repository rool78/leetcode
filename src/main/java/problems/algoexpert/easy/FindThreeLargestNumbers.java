package problems.algoexpert.easy;

public class FindThreeLargestNumbers {

    public static void main(String[] args) {
        int [] res = findThreeLargestNumbers(new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7});
        for (int i : res) {
            System.out.println(i + " ");
        }

    }

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = new int[3];
        for (int i = 2; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIdx = j;
                }
            }
            array[maxIdx] = Integer.MIN_VALUE;
            result[i] = max;
        }
        return result;
    }

    public static int[] findThreeLargestNumbers2(int[] array) {
        int[] result = new int[3];
        for (int i = 0; i < array.length; i++) {



        }

        return result;
    }


    }
