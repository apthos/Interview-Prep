class Solution {
    /*
    Runtime: 6 ms
    Time complexity: O(n) (Arrays.equals will compares 26 values every run so its constant)
    Space complexity: O(1) (Only storing 52 values)
    */
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        int windowSize = s1.length();
        
        int[] permutation = new int[26];
        int[] window = new int[26];
        
        for(int i = 0; i < windowSize; i++) {
            char p = s1.charAt(i);
            permutation[p - 'a'] += 1;
            
            char w = s2.charAt(i);
            window[w - 'a'] += 1;
        }
        
        if(Arrays.equals(window, permutation)) return true;
        
        for(int i = 1; i <= s2.length() - windowSize; i++) {
            char old = s2.charAt(i - 1);
            window[old - 'a'] -= 1;
            
            char current = s2.charAt(windowSize + i - 1);
            window[current - 'a'] += 1;
            
            if(Arrays.equals(window, permutation)) return true;
        }
        
        return false;
    }
}