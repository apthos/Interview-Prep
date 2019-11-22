class Solution {
    /*
    Runtime: 6 ms
    Time complexity: O(n)
    Space complexity: O(1) (no extra space)
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Negate the values at the indexes that have appeared
        //Example: i = 0 so look at nums[0]. nums[0] = 4 so 4 appears in the array. Go to nums[3] and, if positive, negate it to mark index 3 (4th value) as appeared.
        for(int i = 0; i < nums.length; i++) {
            //Ignore if already marked as appeared
            if(nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        
        List<Integer> disappeared = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                disappeared.add(i + 1);
            }
        }
        
        return disappeared;
    }
}