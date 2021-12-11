package problems;

public class Playground {

    public static void main(String[] args) {
        System.out.println(solve(new int[] {0,3}));
    }

    public static int solve(int[] nums) {
        if (nums.length < 1) {
            return nums.length;
        }
        int s = 0;
        int max = nums[s];
        int currentMax = nums[s];
        for (int e = 1; e < nums.length; e++) {
            if (currentMax * nums[e] > currentMax) {
                currentMax *= nums[e];
            } else {
                while (s < e) { //shrink
                    if (nums[s] == 0) {
                        if (0 > currentMax) {
                            currentMax = 0;
                            s++;
                            break;
                        }
                    } else {
                        if ((currentMax * nums[e]) / nums[s] > currentMax) {
                            s++;
                            currentMax = (currentMax * nums[e]) / nums[s];
                            break;
                        }
                        currentMax = (currentMax * nums[e]) / nums[s];
                    }
                    s++;
                }
            }
            max = Math.max(max, currentMax);

        }
        return Math.max(max, currentMax);
    }

}
