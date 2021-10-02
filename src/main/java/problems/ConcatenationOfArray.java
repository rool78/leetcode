package problems;

public class ConcatenationOfArray {
    /*
    Example 1:
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

Example 2:
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]

Constraints:
    n == nums.length
    1 <= n <= 1000
    1 <= nums[i] <= 1000
     */
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        int[] newArr = new int[arr.length * 2];
        //System.out.println(newArr.length);
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i < arr.length) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        for (int i: newArr
             ) {
            System.out.println(i);
        }
    }

    public static int[] getConcatenation(int[] nums) {

        return null;
    }

}
