class Solution {
    /*
    Runtime: 2 ms
    Time complexity: O(n + m) (n = S.length / m = T.length)
    Space complexity: O(n + m) (n = S / m = T)
    */
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> typedS = new Stack<>();
        
        for(int i = 0; i < S.length(); i++) {
            char letter = S.charAt(i);
            if(letter != '#') typedS.push(letter);
            else if(!typedS.isEmpty())typedS.pop();
        }
        
        Stack<Character> typedT = new Stack<>();
        
        for(int i = 0; i < T.length(); i++) {
            char letter = T.charAt(i);
            if(letter != '#') typedT.push(letter);
            else if(!typedT.isEmpty())typedT.pop();
        }
        
        return typedS.equals(typedT);
    }
}