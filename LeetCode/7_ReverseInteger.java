class Solution {
    /*
    Runtime: 2 ms
    Time complexity: O(n)
    Space complexity: O(n)
    */
    public int reverse(int x) {
        StringBuilder numString = new StringBuilder(Integer.toString(x));
        
        for(int i = numString.length() - 2; i >= 0; i--) {
            if(numString.charAt(i) != '-') {
                numString.append(numString.charAt(i));
                numString.deleteCharAt(i);                
            }
        }
        
        long reversed = Long.parseLong(numString.toString());
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
        
        int num = (int) reversed;
        return num;
    }
}