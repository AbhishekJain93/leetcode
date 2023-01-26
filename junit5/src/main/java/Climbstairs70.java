import java.util.HashMap;
import java.util.Map;

public class Climbstairs70 {
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        return climbStairsHelper(n, map);
    }

    public int climbStairsHelper(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n))
            return map.get(n);

        int result = climbStairsHelper(n - 1, map) + climbStairsHelper(n - 2, map);
        map.put(n, result);

        return result;
    }
}
