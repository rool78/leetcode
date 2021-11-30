package problems.algoexpert.medium;

import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {

    public static void main(String[] args) {
        moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2),2);
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int left = 0;
        int right = array.size() - 1;
        while (left < right) {
            if (array.get(left) == toMove) {
                while (left < right) {
                    if (array.get(right) != toMove) {
                        int tmp = array.get(right);
                        array.set(right,array.get(left));
                        array.set(  left, tmp);
                        right--;
                        left++;
                        break;
                    }
                    right--;
                }
            } else {
                left++;
            }
        }
        return array;
    }


}
