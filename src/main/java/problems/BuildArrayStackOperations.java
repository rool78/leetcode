package problems;

import java.util.ArrayList;
import java.util.List;

//        Input: target = [1,3], n = 3
//        Output: ["Push","Push","Pop","Push"]
public class BuildArrayStackOperations {

    public static void main(String[] args) {
        int[] arr = {1, 3};

        System.out.println(buildArray(arr, 0));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<String>();
        int lastValue = target[target.length - 1];
        for (int i = 1; i <= lastValue; i++) {
            if(contains(i, target)){
                result.add("Push");
            }else{
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }

    private static boolean contains(int value, int[] target) {
        for (int j = 0; j < target.length; j++) {
            if (value == target[j]) {
                return true;
            }
        }
        return false;
    }
}
