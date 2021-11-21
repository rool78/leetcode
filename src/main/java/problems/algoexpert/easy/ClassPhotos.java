package problems.algoexpert.easy;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {
    //O(n) greedy algorithm
    public boolean classPhotos(ArrayList<Integer> redShirtHeights,
                               ArrayList<Integer> blueShirtHeights) {
        redShirtHeights.sort(Collections.reverseOrder());
        blueShirtHeights.sort(Collections.reverseOrder());
        String first = redShirtHeights.get(0) < blueShirtHeights.get(0)
                ? "RED"
                : "BLUE";
        for (int i = 0; i < redShirtHeights.size(); i++) {
            if (first.equals("RED")) {
                if (redShirtHeights.get(i) >= blueShirtHeights.get(i))
                    return false;
            } else {
                if (blueShirtHeights.get(i) >= redShirtHeights.get(i))
                    return false;
            }
        }
        return true;
//        Integer[] red = redShirtHeights.toArray(new Integer[0]);
//        Integer[] blue = blueShirtHeights.toArray(new Integer[0]);
//        Arrays.sort(red);
//        Arrays.sort(blue);
//        boolean greaterThan = true;
//        if(red[0] == blue[0])
//            return false;
//        if (red[0] > blue[0]) {
//            for (int i = 1; i < red.length; i++) {
//                if (red[i] <= blue[i])
//                    return false;
//            }
//        } else {
//            for (int i = 1; i < red.length; i++) {
//                if (red[i] >= blue[i])
//                    return false;
//            }
//        }
//        return true;
    }

}
