package problems.algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {

    public static void main(String[] args) {
        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));

        System.out.println(productSum(test));

    }

    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        return recursiveSum(array, 1);
    }
    
    private static int recursiveSum(List<Object> element, int depthLevel) {
        int sum = 0;
        for (Object o : element) {
            if (o instanceof ArrayList) {
                sum += recursiveSum((ArrayList<Object>) o, depthLevel + 1);
            } else {
                sum += (Integer) o;
            }
        }
        return sum * depthLevel;
    }

}
