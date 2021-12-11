package problems.slidingwindow;

import java.util.HashMap;

/*
Given an array of characters where each character represents a fruit tree, you are
given two baskets, and your goal is to put maximum number of fruits in each basket.
The only restriction is that each basket can have only one type of fruit.
You can start with any tree, but you can’t skip a tree once you have started.
You will pick one fruit from each tree until you cannot, i.e., you will stop when you
have to pick from a third fruit type.
Write a function to return the maximum number of fruits in both baskets.

Example 1:
Input: Fruit=['A', 'B', 'C', 'A', 'C']
Output: 3
Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']

Example 2:
Input: Fruit=['A', 'B', 'C', 'B', 'B', 'C']
Output: 5
Explanation: We can put 3 'B' in one basket and two 'C' in the other basket.
This can be done if we start with the second letter: ['B', 'C', 'B', 'B', 'C']
 */
public class FruitsintoBaskets {

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{0,1,6,6,4,4,6}));
    }

    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int startWindow = 0;
        int max = 0;
        for (int endWindow = 0; endWindow < fruits.length; endWindow++) {
            map.put(fruits[endWindow], map.getOrDefault(fruits[endWindow], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[startWindow], map.getOrDefault(fruits[startWindow], 0) - 1);
                if (map.get(fruits[startWindow]) == 0) {
                    map.remove(fruits[startWindow]);
                }
                startWindow++;
            }
            max = Math.max(max, endWindow - startWindow);
        }
        return max;
    }

}
