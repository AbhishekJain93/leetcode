import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SurroundedRegions130Test {
    @Test
    public void one_capture_one_not_capture() {
        char[][] matrix = new char[][] { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
                { 'X', 'O', 'X', 'X' } };

        new SurroundedRegions130().solve(matrix);
        Assertions.assertArrayEquals(matrix, new char[][] { { 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'X', 'X' } });

    }

    @Test
    public void happy_case_1() {
        char[][] matrix = new char[][] { { 'O', 'O', 'O', 'O', 'X', 'X' }, { 'O', 'O', 'O', 'O', 'O', 'O' },
                { 'O', 'X', 'O', 'X', 'O', 'O' }, { 'O', 'X', 'O', 'O', 'X', 'O' }, { 'O', 'X', 'O', 'X', 'O', 'O' },
                { 'O', 'X', 'O', 'O', 'O', 'O' } };

        char[][] ans = new char[matrix.length][];
        for (int i = 0; i < matrix.length; i++)
            ans[i] = matrix[i].clone();

        new SurroundedRegions130().solve(matrix);
        Assertions.assertArrayEquals(matrix, ans);

    }

}
