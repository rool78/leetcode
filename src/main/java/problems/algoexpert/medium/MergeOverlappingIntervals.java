package problems.algoexpert.medium;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
        intervals = mergeOverlappingIntervals(intervals);
        for (int[] arr : intervals) {
            System.out.println("##");
            for (int i : arr) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        List<Integer[]> overlappedIntervals = new ArrayList<>();
        int left = 0;
        int right = 1;
        while (right < intervals.length) {
            if (intervals[right][0] <= intervals[left][1]) {
                intervals[right][0] = intervals[left][0];
            } else {
                overlappedIntervals.add(new Integer[] {intervals[left][0],intervals[left][1]});
                if (left + 2 == intervals.length) {
                    overlappedIntervals.add(new Integer[] {intervals[right][0],intervals[right][1]});
                }
            }
            left++;
            right++;
        }

        int[][] sol = new int[overlappedIntervals.size()][2];
        for (int i = 0; i < overlappedIntervals.size(); i++) {
            sol[i][0] = overlappedIntervals.get(i)[0];
            sol[i][1] = overlappedIntervals.get(i)[1];
        }
        return sol;
    }

}
