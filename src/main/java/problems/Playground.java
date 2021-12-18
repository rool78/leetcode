package problems;

import java.util.Arrays;
import java.util.List;

public class Playground {

    public static void main(String[] args) {
        //change
        System.out.println(solve(new int[] {1,2,5,7,10,13,14,22}));
    }

    public static int solve(int[] nums) {
        if (nums.length == 0) {
            System.out.println("Array vacio");
            return -1;
        }
        if (nums.length == 1) {
            System.out.println("base " + nums[0]);
            return -1;
        }
        int mid = nums.length / 2;
        System.out.println("mid " + nums[mid]);
        solve(Arrays.copyOfRange(nums, 0, mid));
        solve(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return -1;
    }

    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int minElevation = 0;
        int total = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                minElevation = Math.max(minElevation, height[l]);
                total += minElevation - height[l];
                l++;
            } else {
                minElevation = Math.max(minElevation, height[r]);
                total += minElevation - height[r];
                r--;
            }
        }
        return total;
    }

    static void test(List<Integer> list) {
        if (list.size() == 0) {
            return;
        }
        if (list.size() == 1) {
            System.out.println("base " + list.get(0));
            return;
        }
        int mid = list.size() / 2;
        test(list.subList(0, mid));
        System.out.println("mid " + list.get(mid));
        test(list.subList(mid + 1, list.size()));
    }

}
