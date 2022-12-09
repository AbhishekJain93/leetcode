import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();
		triangle.add(List.of(1));

		for (int i = 1; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();

			for (int j = 0; j <= i; j++) {
				if (j == 0)
					row.add(j, triangle.get(i - 1).get(j));
				else if (j == i)
					row.add(j, triangle.get(i - 1).get(j - 1));
				else
					row.add(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
			}
			triangle.add(row);
		}

		return triangle;
	}
}
