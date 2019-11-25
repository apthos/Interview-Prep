class Solution {
    /*
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        int totalSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            arraySum += nums[i];
            totalSum += i;
        }
        
        totalSum += nums.length;
        
        return totalSum - arraySum;
    }
}