class Solution {
    /*
    Runtime: 1 ms
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public char findTheDifference(String s, String t) {
        int[] lettersInS = new int[26];
        int[] lettersInT = new int[26];
        
        //count the occurrences of each letter
        for(int i = 0; i < s.length(); i++) {
            lettersInS[s.charAt(i) - 'a'] += 1;
            lettersInT[t.charAt(i) - 'a'] += 1;
        }
        
        //add the final letter in t
        lettersInT[t.charAt(t.length() - 1) - 'a'] += 1;
        
        //find the difference in occurrences of each letter
        for(int i = 0; i < lettersInS.length; i++) {
            if(lettersInS[i] != lettersInT[i]) {
                return (char) (i + 'a');
            }
        }
        
        return ' ';
    }
}