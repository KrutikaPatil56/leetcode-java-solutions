class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int j = 1;
        for(int i = 0; j < nums.length; i+= 2){
            max = max + Math.min(nums[i] , nums[j]);
            j += 2;
        }
        return max;
    }
}