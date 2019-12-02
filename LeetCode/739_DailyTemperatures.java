class Solution {
    /*
    Runtime: 3 ms
    Time complexity: O(n^2)
    Space complexity: O(n)
    */
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        
        int maxTemp = T.length - 1;
        
        for(int i = T.length - 2; i >= 0; i--) {
            //if today is the hottest so far, there will be no hotter day in the future
            if(T[i] >= T[maxTemp]) {
                maxTemp = i; days[i] = 0;
            }
            else {
                //start tomorrow, if today is hotter then jump to the day that is hotter than the checked day
                int j = i + 1;
                while(T[i] >= T[j]) j += days[j];
                days[i] = j - i;
            }
        }
        return days;
    }
}