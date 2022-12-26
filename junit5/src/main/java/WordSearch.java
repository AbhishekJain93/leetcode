public class WordSearch {

	public boolean exist(char[][] board, String word) {
		char[] w1 = word.toCharArray();
		boolean[][] visited = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (wordSearchHelper(board, w1, i, j, 0, visited))
					return true;
			}
		}

		return false;
	}

	private boolean wordSearchHelper(char[][] board, char[] w1, int i, int j, int idx, boolean[][] visited) {
		if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || visited[i][j]
				|| board[i][j] != w1[idx])
			return false;

		visited[i][j] = true;
		if (idx == w1.length - 1)
			return board[i][j] == w1[idx];

		if (wordSearchHelper(board, w1, i + 1, j, idx + 1, visited) ||
				wordSearchHelper(board, w1, i - 1, j, idx + 1, visited) ||
				wordSearchHelper(board, w1, i, j + 1, idx + 1, visited) ||
				wordSearchHelper(board, w1, i, j - 1, idx + 1, visited)) {
			return true;
		}

		visited[i][j] = false;
		return false;
	}
}
