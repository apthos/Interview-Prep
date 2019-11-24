class Solution {
    /* Not Done
    Runtime: 
    Time complexity: 
    Space complexity: 
    */
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}