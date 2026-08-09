class Solution {
    public void reverseString(char[] s) {
       int front = 0;
       int rare = s.length - 1;

        while(front <= rare){
            char temp = s[front];
            s[front] = s[rare];
            s[rare] = temp;

            front++;
            rare--;
        }
        
    }
    
}