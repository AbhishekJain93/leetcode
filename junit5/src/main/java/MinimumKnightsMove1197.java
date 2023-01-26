import java.util.HashMap;
import java.util.Map;

public class MinimumKnightsMove1197 {
	public int minKnightMoves(int x, int y) {
		Map<String, Integer> dp = new HashMap<>();
		return minKnightMovesH(Math.abs(x), Math.abs(y), dp);
	}

	public int minKnightMovesH(int x, int y, Map<String, Integer> dp) {
		// x = Math.abs(x);
		// y = Math.abs(y);
		if (x == 0 && y == 0)
			return 0;

		if (Math.abs(x) + Math.abs(y) == 2)
			return 2;

		if (dp.containsKey(x + ":" + y)) {
			return dp.get(x + ":" + y);
		}

		int val = 1 + Math.min(minKnightMovesH(Math.abs(x - 1), Math.abs(y - 2), dp),
				minKnightMovesH(Math.abs(x - 2), Math.abs(y - 1), dp));

		dp.put(x + ":" + y, val);
		return val;
	}
}
