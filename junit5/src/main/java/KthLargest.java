import java.util.PriorityQueue;

public class KthLargest {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(); // or we can simply have max heap, add all elements and pop
																// k times

		for (int i = 0; i < nums.length; i++) {
			if (i >= k) {
				if (nums[i] > heap.peek()) {
					heap.poll();
					heap.offer(nums[i]);
				}
			} else {
				heap.offer(nums[i]);
			}

		}

		return heap.peek();
	}

	public int findKthLargest2(int[] nums, int k) {
		int l = 0, r = nums.length - 1;

		while (l <= r) {
			int pos = partition(nums, l, r);
			if (pos == nums.length - k)
				return nums[pos];
			else if (pos < nums.length - k) {
				l = pos + 1;
			} else {
				r = pos - 1;
			}
		}

		return -1;
	}

	private int partition(int[] nums, int start, int end) {
		int idx = start + (end - start) / 2;
		int temp = nums[idx];
		nums[idx] = nums[end];
		nums[end] = temp;

		int pos = start, i = start;

		while (i < end) {
			if (nums[i] <= nums[end]) {
				int temp1 = nums[i];
				nums[i] = nums[pos];
				nums[pos] = temp1;
				i++;
				pos++;
			} else {
				i++;
			}
		}
		temp = nums[pos];
		nums[pos] = nums[end];
		nums[end] = temp;

		return pos;
	}
}
