import java.util.HashMap;
import java.util.Map;

public class Minpathcost2304 {

    public int minPathCost(int[][] grid, int[][] moveCost) {
        Map<Integer, Integer> dp = new HashMap<>();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            min = Math.min(costHelper(grid, moveCost, 0, i, dp), min);
        }

        return min;
    }

    private int costHelper(int[][] grid, int[][] moveCost, int i, int j, Map<Integer, Integer> dp) {
        if (i == grid.length - 1)
            return grid[i][j];

        if (dp.containsKey(grid[i][j]))
            return dp.get(grid[i][j]);

        int min = Integer.MAX_VALUE;

        for (int k = 0; k < grid[0].length; k++) {
            int stepCost = grid[i][j] + moveCost[grid[i][j]][k];
            min = Math.min(min, stepCost + costHelper(grid, moveCost, i + 1, k, dp));
        }

        dp.put(grid[i][j], min);
        return min;
    }
}
