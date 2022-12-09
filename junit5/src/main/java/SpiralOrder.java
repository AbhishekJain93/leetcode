import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();

		int startX = 0, startY = 0, numX = matrix.length, numY = matrix[0].length;

		while (numX > 0 && numY > 0) {
			result.addAll(traverseOuter(matrix, startX, startY, numX, numY));
			startX++;
			startY++;
			numX -= 2;
			numY -= 2;
		}

		return result;
	}

	public List<Integer> traverseOuter(int[][] matrix, int startX, int startY, int numX, int numY) {
		List<Integer> result = new ArrayList<>();

		for (int j = 0; j < numY; j++) {
			result.add(matrix[startX][startY + j]);
		}

		// System.out.println(result);

		for (int i = 1; i < numX; i++) {
			result.add(matrix[startX + i][startY + numY - 1]);
		}

		// System.out.println(result);

		for (int j = numY - 2; j >= 0 && numX > 1; j--) {
			result.add(matrix[startX + numX - 1][startY + j]);
		}
		// System.out.println(result);

		for (int i = numX - 2; i > 0 && numY > 1; i--) {
			result.add(matrix[startX + i][startY]);
		}

		// System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10,
		// 11, 12 } };
		int[][] matrix = new int[][] { { 1 }, { 2 }, { 3 } };
		// System.out.println(new SpiralOrder().traverseOuter(matrix, 1, 1, 2, 1));

		System.out.println(new SpiralOrder().spiralOrder(matrix));
	}

}
