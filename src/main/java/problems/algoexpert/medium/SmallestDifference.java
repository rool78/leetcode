package problems.algoexpert.medium;

public class SmallestDifference {

    public static void main(String[] args) {
        System.out.println(absoluteDifference(-2, 4));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int smallestDifference = Integer.MAX_VALUE;
        int[] result = new int[2];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                int currentDifference = Math.abs(absoluteDifference(arrayOne[i], arrayTwo[j]));
                if (currentDifference < smallestDifference) {
                    smallestDifference = currentDifference;
                    result = new int[] {arrayOne[i], arrayTwo[j]};
                }
            }
        }
        return result;
    }

    private static int absoluteDifference(int i, int j) {
        if (i < 0 && j >= 0 || j < 0 && i >= 0) {
                return Math.abs(i) + Math.abs(j);
        }
        if (Math.abs(i) > Math.abs(j)) {
          return Math.abs(i) - Math.abs(j);
        } else {
            return Math.abs(j) - Math.abs(i);
        }
    }


}
