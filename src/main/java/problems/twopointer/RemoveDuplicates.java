package problems.twopointer;

/*
Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing
the duplicates in-place return the length of the subarray that has no duplicate in it.

Example 1:
Input: [2, 3, 3, 3, 6, 9, 9]
Output: 4
Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].

Example 2:
Input: [2, 2, 2, 11]
Output: 2
Explanation: The first two elements after removing the duplicates will be [2, 11].
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeElegant(new int[]{2, 3, 3, 3, 6, 9, 9}));
    }

    public static int remove(int[] arr) {
        if (arr.length < 2)
            return arr.length;
        int p1 = 0;
        int p2 = 1;
        int duplicated = 0;
        while (p1 < arr.length && p2 < arr.length) {
            if (arr[p1] == arr[p2])
                duplicated++;
            if (p1 < p2)
                p1 = p2 + 1;
            else
                p2 = p1 + 1;
        }
        return arr.length - duplicated;
    }

    //Otra solucion mas elegante
    //TODO review
    public static int removeElegant(int[] arr) {
        int pointerNoDuplicate = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[pointerNoDuplicate - 1] != arr[i]) {
                arr[pointerNoDuplicate] = arr[i];
                pointerNoDuplicate++;
            }
        }
        return pointerNoDuplicate;
    }

}
