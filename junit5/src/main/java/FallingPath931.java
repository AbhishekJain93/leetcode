import java.util.Arrays;

public class FallingPath931 {
    public int minFallingPathSum(int[][] matrix) {
        int[][] min = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            min[matrix.length - 1][i] = matrix[matrix.length - 1][i];
        }

        for (int i = matrix.length - 2; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                int left = j > 0 ? min[i + 1][j - 1] : Integer.MAX_VALUE;
                int right = j < matrix[0].length - 1 ? min[i + 1][j + 1] : Integer.MAX_VALUE;

                min[i][j] = matrix[i][j] + Math.min(left, Math.min(min[i + 1][j], right));
            }

        }

        return Arrays.stream(min[0]).min().getAsInt();
    }
}
