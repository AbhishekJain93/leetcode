import java.util.ArrayList;
import java.util.List;

public class NestedListSum {
	public int depthSum(List<NestedInteger> nestedList) {
		return depthSumHelper(nestedList, 1);
	}

	private int depthSumHelper(List<NestedInteger> nestedList, int depth) {
		int sum = 0;
		for (int i = 0; i < nestedList.size(); i++) {
			if (nestedList.get(i).isInteger()) {
				sum += depth * nestedList.get(i).getInteger();
			} else {

				sum += depthSumHelper(nestedList.get(i).getList(), depth + 1);
			}
		}

		return sum;
	}
}

class NestedIntegerImpl implements NestedInteger {
	Integer i;
	List<NestedInteger> list = new ArrayList<>();

	@Override
	public boolean isInteger() {

		return i != null;
	}

	@Override
	public Integer getInteger() {

		return i;
	}

	@Override
	public void setInteger(int value) {
		i = value;

	}

	@Override
	public void add(NestedInteger ni) {
		list.add(ni);

	}

	@Override
	public List<NestedInteger> getList() {

		return list;
	}

}

interface NestedInteger {
	// Constructor initializes an empty nested list.
	// public NestedInteger();

	// // Constructor initializes a single integer.
	// public NestedInteger(int value);

	// @return true if this NestedInteger holds a single integer, rather than a
	// nested list.
	public boolean isInteger();

	// @return the single integer that this NestedInteger holds, if it holds a
	// single integer
	// Return null if this NestedInteger holds a nested list
	public Integer getInteger();

	// Set this NestedInteger to hold a single integer.
	public void setInteger(int value);

	// Set this NestedInteger to hold a nested list and adds a nested integer to it.
	public void add(NestedInteger ni);

	// @return the nested list that this NestedInteger holds, if it holds a nested
	// list
	// Return empty list if this NestedInteger holds a single integer
	public List<NestedInteger> getList();
}