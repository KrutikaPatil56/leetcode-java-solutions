class Solution {
    public int searchInsert(int[] nums, int target) {
    
        int low = 0; 
        int high = nums.length -1;
        int mid = (low + high)/2;

        if(target < nums[low]){
            return 0;
        }else if(target > nums[high]){
            return nums.length ;
        }else if(nums.length == 1){
            return 0;
        }


        int flag = 0;
        while(low < high){
            mid = (low + high)/2;
            if(target == nums[mid]){
                flag = 1;
                return mid;
            }else if(target < nums[mid]){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        if(flag == 0 && nums[low] < target){
            flag = low +1;
        }else{
            flag = low;
        }
        return flag;
    }
}