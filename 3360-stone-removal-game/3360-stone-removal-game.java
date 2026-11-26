class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10) return false;
        n = n - 10;
        int c = 0;

        for(int i = 9; i > 0; i--){
            n = n - i;
            if((n < 0 ) && (c % 2 == 0)){
                return true;
            }else if((n < 0 ) && (c % 2 != 0)){
                return false;
            }
            c++;
        }
    return false;

    }
}