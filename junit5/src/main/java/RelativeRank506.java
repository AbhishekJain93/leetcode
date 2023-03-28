import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRank506 {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> idx = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            idx.put(score[i], i);
        }

        Arrays.sort(score);
        String[] res = new String[score.length];

        if (score.length >= 1)
            res[idx.get(score[score.length - 1])] = "Gold Medal";
        if (score.length >= 2)
            res[idx.get(score[score.length - 2])] = "Silver Medal";
        if (score.length >= 3)
            res[idx.get(score[score.length - 3])] = "Bronze Medal";

        for (int i = 4; i <= score.length; i++) {
            res[idx.get(score[score.length - i])] = "" + (i);
        }

        return res;
    }
}
