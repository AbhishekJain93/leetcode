public class SearchMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {

		int numRows = matrix.length;
		int numCols = matrix[0].length;

		int matchedRow = searchRowHelper(matrix, target, 0, numRows - 1);
		if (matchedRow == -1)
			return false;

		return searchColumnHelper(matrix[matchedRow], target, 0, numCols - 1) == -1 ? false : true;
	}

	private int searchRowHelper(int[][] matrix, int target, int start, int end) {
		if (start > end)
			return -1;

		int mid = start + (end - start) / 2;

		if (matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target)
			return mid;

		else if (matrix[mid][0] > target) {
			return searchRowHelper(matrix, target, start, mid - 1);
		} else {
			return searchRowHelper(matrix, target, mid + 1, end);
		}
	}

	private int searchColumnHelper(int[] matrix, int target, int start, int end) {
		if (start > end)
			return -1;

		int mid = start + (end - start) / 2;

		if (matrix[mid] == target)
			return mid;

		else if (matrix[mid] < target)
			return searchColumnHelper(matrix, target, mid + 1, end);

		else
			return searchColumnHelper(matrix, target, start, mid - 1);
	}
}
