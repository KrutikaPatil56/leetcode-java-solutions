class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest = nums[0], largest = nums[0];
        for(int i = 0; i < nums.length; i++ ){
            if(largest < nums[i]){
                largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length ; i++){
        list.add(nums[i]);
        }
       // int arr[] = new int[largest - smallest + 1];
        for(int i = smallest; i <= largest; i++){
            if (list.contains(i)){
                list.remove(Integer.valueOf(i));
            }else{
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}