import java.util.*;

public class Playground {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,7,3,4,10}));
    }

    public static int solve(int[] nums) {
        int counter = 0;
        int[] sortedArr = nums;
        Arrays.sort(sortedArr);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == sortedArr[i]) {
                counter++;
            }
        }
        return counter;
    }
}




