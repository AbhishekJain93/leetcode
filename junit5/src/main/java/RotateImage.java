public class RotateImage {
	public void rotate(int[][] matrix) {
		rotateHelper(matrix, 0, matrix.length);

	}

	public void rotateHelper(int[][] matrix, int offest, int size) {
		if (size == 0 || size == 1)
			return;

		for (int i = 0; i < size - 1; i++) {
			int temp = matrix[0 + offest][0 + offest + i];
			matrix[0 + offest][0 + offest + i] = matrix[offest + size - 1 - i][0 + offest];
			matrix[offest + size - 1 - i][0 + offest] = matrix[size - 1 + offest][size - 1 - i + offest];
			matrix[size - 1 + offest][size - 1 - i + offest] = matrix[0 + i + offest][size - 1 + offest];
			matrix[0 + i + offest][size - 1 + offest] = temp;
		}

		rotateHelper(matrix, offest + 1, size - 2);
	}
}
