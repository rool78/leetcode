package problems.slidingwindow;

import java.util.HashSet;

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
        System.out.println(totalFruit(new int[]{1,2,3,2,2}));
    }

    public static int totalFruit(int[] fruits) {
        HashSet<Integer> set = new HashSet<>();
        int p1 = 0;
        int max = 0;
        int currentMax = 0;
        for (int p2 = 0; p2 < fruits.length; p2++) {
            int a = fruits[p1];
            int b = fruits[p2];
            currentMax++;
            if (!set.contains(fruits[p2])) {
                if (set.size() < 2) {
                    set.add(fruits[p2]);
                } else {
                    max = Math.max(max, currentMax);
                    set.remove(fruits[p1++]);
                    p2--;
                    currentMax = 1;
                }
            }
        }
        return Math.max(max, currentMax);
    }


}
