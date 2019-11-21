class Solution {
    /* 
    Runtime: 10 ms
    Time complexity: O(n^2)
    Space complexity: O(1)
    */
    public boolean validPalindrome(String s) {
        //Any single character or an empty string is a palindrome
        if(s.length() < 2) return true;
        
        for(int i = 0; i < s.length() / 2; i++) {
            int j = s.length() - 1 - i;
            if(s.charAt(i) != s.charAt(j)){
                //See if ignoring the left or the right character will lead to a palindrome
                return palindrome(s, i + 1, j) || palindrome(s, i, j - 1);
            }
        }
        return true;     
    }
    
    public boolean palindrome(String s, int start, int end) {
        int left = start;
        int right = end;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}