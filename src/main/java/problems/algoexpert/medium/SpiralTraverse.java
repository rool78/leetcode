package problems.algoexpert.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}};

        for (int i = 0; i < a.length; i++) {
            System.out.println("####i->" + i);
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" j->" + j + "=" + a[i][j]);
            }
            System.out.println();
        }
        for (int i : spiralTraverse(a)) {
            System.out.print(" " + i);
        }

    }

    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();
        if (array.length == 0) {
            return new ArrayList<>();
        }
        int startRow = 0;
        int startColumn = 0;
        int endRow = array.length - 1;
        int endColumn = array[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++) {
                result.add(array[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(array[i][endColumn]);
            }
            for (int i = endColumn - 1; i >= startColumn; i--) {
                if (startRow == endRow) {
                    break;
                }
                result.add(array[endRow][i]);
            }
            for (int i = endRow - 1; i > startRow; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                result.add(array[i][startColumn]);
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        return result;
    }
}
