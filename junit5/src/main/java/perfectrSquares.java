import java.util.HashMap;
import java.util.Map;

public class perfectrSquares {

    public static void main(String[] args) {
        System.out.println(new perfectrSquares().numSquares(13));
    }

    public int numSquares(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(0, 0);
        return numSquaresHelper(n, map);
    }

    public int numSquaresHelper(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n))
            return map.get(n);

        int min = n;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            min = Math.min(min, 1 + numSquaresHelper(n - i * i, map));
        }

        map.put(n, min);
        return min;
    }
}
