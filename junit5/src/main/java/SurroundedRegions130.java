import java.util.HashSet;
import java.util.Set;

public class SurroundedRegions130 { // better:
                                    // https://leetcode.com/problems/surrounded-regions/solutions/691675/c-beginner-friendly-boundary-dfs-inplace/
    public void solve(char[][] board) {
        int[][] visited = new int[board.length][board[0].length];
        int counter = 1;
        Set<Integer> toBeFlippedSet = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && visited[i][j] == 0) {
                    boolean isToBeFlipped = dfs(board, i, j, visited, counter);
                    if (isToBeFlipped) {
                        toBeFlippedSet.add(counter);
                    }
                    counter++;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (toBeFlippedSet.contains(visited[i][j])) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private boolean dfs(char[][] board, int i, int j, int[][] visited, int counter) {
        boolean toBeFlipped = true;
        if (i == 0 || i == board.length - 1 || j == 0 || j == board[0].length - 1) {
            toBeFlipped = false;
        }

        visited[i][j] = counter;
        if (i != board.length - 1 && visited[i + 1][j] == 0 && board[i + 1][j] == 'O') {
            toBeFlipped = dfs(board, i + 1, j, visited, counter) && toBeFlipped;
        }

        if (i != 0 && visited[i - 1][j] == 0 && board[i - 1][j] == 'O') {
            toBeFlipped = dfs(board, i - 1, j, visited, counter) && toBeFlipped;
        }

        if (j != board[0].length - 1 && visited[i][j + 1] == 0 && board[i][j + 1] == 'O') {
            toBeFlipped = dfs(board, i, j + 1, visited, counter) && toBeFlipped;
        }

        if (j != 0 && visited[i][j - 1] == 0 && board[i][j - 1] == 'O') {
            toBeFlipped = dfs(board, i, j - 1, visited, counter) && toBeFlipped;
        }

        return toBeFlipped;
    }
}
