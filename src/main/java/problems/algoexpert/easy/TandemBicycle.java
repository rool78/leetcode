package problems.algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class TandemBicycle {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        int result = 0;
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
            for (int i = 0; i < redShirtSpeeds.length; i++) {
                if (fastest) {
                    result += Math.max(redShirtSpeeds[redShirtSpeeds.length - 1 - i],
                            blueShirtSpeeds[i]);
                } else {
                    result += Math.max(redShirtSpeeds[redShirtSpeeds.length - 1 - i],
                            blueShirtSpeeds[blueShirtSpeeds.length - 1 - i]);
            }
        }
        return result;
    }

}
