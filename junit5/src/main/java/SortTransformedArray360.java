
public class SortTransformedArray360 {
	public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
		int l = 0, r = nums.length - 1;
		int[] res = new int[nums.length];
		int p = 0;

		if (a < 0) {// downward parabola lowest values on extremetes
			while (l <= r) {
				int transformed_l = transformed(nums[l], a, b, c);
				int transformed_r = transformed(nums[r], a, b, c);
				if (transformed_l < transformed_r) {
					res[p] = transformed_l;
					l++;
					p++;
				} else {
					res[p] = transformed_r;
					r--;
					p++;
				}
			}
		} else if (a > 0) {// upward parabola lowest values on extremetes
			while (l <= r) {
				int transformed_l = transformed(nums[l], a, b, c);
				int transformed_r = transformed(nums[r], a, b, c);
				if (transformed_l < transformed_r) {
					res[p] = transformed_r;
					r--;
					p++;
				} else {
					res[p] = transformed_l;
					l++;
					p++;
				}
			}
			reverse(res);
		} else {
			if (a * nums[l] * nums[l] + b * nums[l] + c < a * nums[r] * nums[r] + b * nums[r] + c) {
				// do nothing, as bx+c is a line and it is a line with positive slope;
				for (int i = 0; i < res.length; i++) {
					res[i] = transformed(nums[i], a, b, c);
				}

			} else {
				for (int i = res.length - 1, idx = 0; i >= 0; i--, idx++) {
					res[idx] = transformed(nums[i], a, b, c);
				}
			}
		}
		return res;
	}

	public int transformed(int val, int a, int b, int c) {
		return a * val * val + b * val + c;
	}

	public int[] reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}

		return a;
	}
}