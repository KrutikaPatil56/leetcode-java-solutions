class Solution {
    public int minMoves(int[] nums) {
        int largest = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        int moves = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != largest){
                moves = moves + (largest - nums[i]);
            }
        }

        return moves;
    }
}