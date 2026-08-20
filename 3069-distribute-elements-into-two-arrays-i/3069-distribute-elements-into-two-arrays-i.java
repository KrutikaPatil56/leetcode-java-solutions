class Solution {
    public int[] resultArray(int[] nums) {

        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];

        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int i1 = 0;
        int i2 = 0;
        for(int i = 2; i < nums.length; i++){
            if(arr1[i1] > arr2[i2]){
                i1 += 1;
                arr1[i1]  = nums[i] ;
            }else if(arr2[i2] > arr1[i1] ){
                i2 += 1;
                arr2[i2] = nums[i] ;
            }
        } 

        int[] result = new int[nums.length];

        int k = 0;

        for (int i = 0; i <= i1; i++) {
            result[k++] = arr1[i];
        }

        for (int i = 0; i <= i2; i++) {
            result[k++] = arr2[i];
        }

        return result;
    }
}