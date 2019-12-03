class Solution {
    /*
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[slow];
        
        //traverse "linked list" until the cycle is found
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        
        //look for start of cycle (refer to Floyd's Tortoise and Hare to see proof of concept)
        slow = 0;
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return fast;
    }
}