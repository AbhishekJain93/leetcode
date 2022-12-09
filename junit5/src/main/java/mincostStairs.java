import java.util.HashMap;
import java.util.Map;

public class mincostStairs {
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(cost.length - 1, cost[cost.length - 1]);
        map.put(cost.length - 2, cost[cost.length - 2]);

        return Math.min(costStatirHelper(cost, 0, map), costStatirHelper(cost, 1, map));
    }

    private int costStatirHelper(int[] cost, int i, Map<Integer, Integer> map) {
        if (map.containsKey(i))
            return map.get(i);

        int result = cost[i] + Math.min(costStatirHelper(cost, i + 1, map), costStatirHelper(cost, i + 2, map));
        map.put(i, result);

        return result;
    }
}
