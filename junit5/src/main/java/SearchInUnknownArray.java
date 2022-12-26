public class SearchInUnknownArray {
	public int search(ArrayReader reader, int target) {
		int l = 0, r = 10;

		while (reader.get(r) < target) {

			l = r;
			r = r * r;
		}

		while (l <= r) {
			int mid = l + (r - l) / 2;
			int val = reader.get(mid);
			if (val == target)
				return mid;

			else if (val < target)
				l = mid + 1;
			else
				r = mid - 1;
		}

		return -1;
	}
}

interface ArrayReader {
	public int get(int index);
}

class ArrayReaderImpl implements ArrayReader {
	int[] array;

	public ArrayReaderImpl(int[] arr) {
		array = arr;
	}

	@Override
	public int get(int index) {
		if (index < 0 || index >= array.length)
			return Integer.MAX_VALUE;

		return array[index];
	}
}