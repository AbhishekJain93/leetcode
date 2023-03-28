public class BarakaTest {
    // second largest item
    // input [9,10,8,0,3,-1]

    // [1,2,3]
    public int secondLargest(int[] nums) { // O(n)
        int largest = nums[0], secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];

            }
        }

        return secondLargest;
    }
}
