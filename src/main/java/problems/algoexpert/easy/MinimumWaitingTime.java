package problems.algoexpert.easy;

import java.util.Arrays;

public class MinimumWaitingTime {

    public int minimumWaitingTime(int[] queries) {
        int waitingTime = 0;
        Arrays.sort(queries);
        int timeAccumulated = queries[0];
        for (int i = 1; i < queries.length; i++) {
            waitingTime += timeAccumulated;
            timeAccumulated += queries[i];

        }
        return waitingTime;
    }
}
