class Solution {
    /* Needs improvement
    Runtime: 716 ms
    Time complexity: O(n^2)
    Space complexity: O(n)
    */
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        
        for(int i = 0; i < days.length - 1; i++) {
            for(int j = i + 1; j < days.length; j++) {
                if(T[i] < T[j]) {
                    days[i] = j - i;
                    j = days.length;
                }
            }
        }
        
        return days;
    }
}