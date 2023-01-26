import java.util.HashSet;
import java.util.Set;

public class SmallestCommonElementInRows1198 {
	public int smallestCommonElement(int[][] mat) {
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		for (int i = 0; i < mat[0].length; i++) {
			setA.add(mat[0][i]);
		}

		for (int i = 1; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (setA.contains(mat[i][j])) {
					setB.add(mat[i][j]);
				}
			}
			if (setB.isEmpty())
				return -1;

			setA = setB;
			setB = new HashSet<>();
		}

		return setA.stream().mapToInt(v -> v).min().getAsInt();
	}
}
