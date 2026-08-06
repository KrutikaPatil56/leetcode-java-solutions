class Solution {
    public int mySqrt(int x) {
        int high = x;
        int low = 0;
        int ans = 0;

        while(high >= low){
            int mid = (high + low )/2;
            if((long)mid * mid == x){
                return mid;
            }
            else if((long)mid * mid < x){
                ans = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
}