import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecoverArray1743 {
    public int[] restoreArray(int[][] adjacentPairs) {
        int[] res = new int[adjacentPairs.length + 1];

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] pair : adjacentPairs) {
            map.putIfAbsent(pair[0], new ArrayList<>());
            map.putIfAbsent(pair[1], new ArrayList<>());
            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }

        for (java.util.Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            if (e.getValue().size() == 1) {
                res[0] = e.getKey();
                break;
            }
        }

        int prev = res[0];
        int curr = map.get(res[0]).get(0);

        for (int i = 1; i < res.length; i++) {
            res[i] = curr;
            for (int j = 0; j < map.get(curr).size(); j++) {
                if (map.get(curr).get(j) != prev) {
                    prev = curr;
                    curr = map.get(curr).get(j);
                    break;
                }
            }
        }

        return res;
    }
}
