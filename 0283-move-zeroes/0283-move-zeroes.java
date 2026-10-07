class Solution {
    public void moveZeroes(int[] nums) {

        int j = 1;
        int i = 0;
        while(j < nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }else if(nums[i] == 0 && nums[j] == 0){
                j++;
            }else{
                i++;
                j++;
            }
        }
       
    }
}