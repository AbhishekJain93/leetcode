
public class numberOfIslands {
    public int numIslands(char[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];

        int islandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    islandCount++;
                    dfs(grid, visited, i, j);
                }
            }
        }

        return islandCount;
    }

    public void dfs(char[][] grid, int[][] visited, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
            return;

        if (visited[row][col] == 1 || grid[row][col] == '0')
            return;

        visited[row][col] = 1;
        dfs(grid, visited, row - 1, col);
        dfs(grid, visited, row + 1, col);
        dfs(grid, visited, row, col - 1);
        dfs(grid, visited, row, col + 1);
    }
}
