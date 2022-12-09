public class MergeSortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1, p2 = n - 1, current = m + n - 1;

		while (current > -1) {
			if (p1 < 0) {
				nums1[current] = nums2[p2];
				p2--;
				current--;
			} else if (p2 < 0) {
				nums1[current] = nums1[p1];
				p1--;
				current--;
			}

			else if (nums1[p1] >= nums2[p2]) {
				nums1[current] = nums1[p1];
				p1--;
				current--;
			} else {
				nums1[current] = nums2[p2];
				p2--;
				current--;
			}
		}
	}
}
