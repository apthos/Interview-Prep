class Solution {
    /*
    Runtime: 1 ms
    Time complexity: O(a lot) 
    Space complexity: O(even more) 
    */
    public String countAndSay(int n) {
        if(n == 1) return "1";
        
        String prev = countAndSay(n - 1);
        StringBuilder sequence = new StringBuilder();
        
        int i = 0;
        while(i < prev.length()) {
            int count = 0;
            char term = prev.charAt(i);
            while(i < prev.length() && prev.charAt(i) == term) {
                count++;
                i++;
            }
            sequence.append(count);
            sequence.append(Character.getNumericValue(term));
        }
        
        return sequence.toString();
    }
}