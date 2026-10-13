class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int product = 1;
        
        int product1 = nums[nums.length-3] * nums[nums.length-2] * nums[nums.length-1];
        int product2 = nums[0] * nums[1] * nums[nums.length -1];
        return Math.max(product1, product2);
    }
}