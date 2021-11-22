package problems.algoexpert.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions,
                                   ArrayList<Integer> results) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < results.size(); i++) {
            String matchWinner;
            if (results.get(i) == 0) {
                 matchWinner = competitions.get(i).get(1);
            } else {
                matchWinner = competitions.get(i).get(0);
            }
            map.put(matchWinner, map.getOrDefault(matchWinner, 0) + 3);
        }
        String tournamentWinner = null;
        int maxPoints = -1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxPoints) {
              tournamentWinner = entry.getKey();
              maxPoints = entry.getValue();
            }
        }
        return tournamentWinner;
    }

}
