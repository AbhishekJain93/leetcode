import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ZeroOrOneLoss2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            int[] matchI = matches[i];
            map.putIfAbsent(matchI[0], 0);
            map.put(matchI[1], map.getOrDefault(matchI[1], 0) + 1);
        }

        List<Integer> noLosses = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 0)
                noLosses.add(e.getKey());
            else if (e.getValue() == 1)
                oneLoss.add(e.getKey());
        }

        Collections.sort(noLosses);
        Collections.sort(oneLoss);

        return List.of(noLosses, oneLoss);
    }
}
