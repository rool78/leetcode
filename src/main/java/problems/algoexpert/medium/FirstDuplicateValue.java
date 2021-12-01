package problems.algoexpert.medium;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {

    public int firstDuplicateValue(int[] array) {
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (values.contains(array[i])) {
                return array[i];
            } else {
                values.add(array[i]);
            }
        }
        return -1;
    }

}
