class Solution {
    /* NEEDS IMPROVEMENT
    Runtime: 21 ms (only faster than 68.11%)
    Time complexity: O(n * m) (m = number of perfect primes between 1 to n)
    Space complexity: O(n) (only less than 18.05%)
    */
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        
        for(int i = 1; i < dp.length; i++) {
            dp[i] = n + 1;
        }
        
        for(int i = 1; i < dp.length; i++) {
            int j = 1;
            while(j * j <= i) {
                dp[i] = Math.min(dp[i], 1 + dp[i - (j * j)]);
                j++;
            }
        }
        
        return dp[n];
    }
}