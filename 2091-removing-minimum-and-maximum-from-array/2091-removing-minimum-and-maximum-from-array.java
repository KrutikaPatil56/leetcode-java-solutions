class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return 1;
        }

        int smallest = nums[0];
        int largest = nums[0];

        int si = 0;
        int li = 0;

        // Find minimum, maximum and their indices
        for (int i = 1; i < n; i++) {

            if (nums[i] < smallest) {
                smallest = nums[i];
                si = i;
            }

            if (nums[i] > largest) {
                largest = nums[i];
                li = i;
            }
        }

        // Make sure si is the smaller index
        int left = Math.min(si, li);
        int right = Math.max(si, li);

        // Option 1: Remove both from left
        int removeFromLeft = right + 1;

        // Option 2: Remove both from right
        int removeFromRight = n - left;

        // Option 3: Remove left element from left
        // and right element from right
        int removeBothSides = (left + 1) + (n - right);

        return Math.min(
            removeFromLeft,
            Math.min(removeFromRight, removeBothSides)
        );
    }
}