package problems;

public class Playground {

    public static void main(String[] args) {

    }

    public int[] sortedSquaredArray(int[] array) {
        int p1 = -1;
        int p2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                p2 = i;
                if (p2 - 1 >= 0)
                    p1 = i - 1;
            }
        }
        if (p2 == Integer.MAX_VALUE)
            p1 = array.length - 1;

        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            int valLeft = Integer.MAX_VALUE;
            int valRight = Integer.MAX_VALUE;
            if (p1 >= 0)
                valLeft = (int) Math.pow(array[p1], 2);
            if (p2 < array.length)
                valRight = (int) Math.pow(array[p2], 2);
            if (valLeft < valRight) {
                result[i] = valLeft;
                p1--;
            } else {
                result[i] = valRight;
                p2++;
            }
        }
        return result;
    }

}
