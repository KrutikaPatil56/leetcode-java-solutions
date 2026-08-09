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
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
    
}