class Solution {
    /* NEEDS IMPROVEMENT
    Runtime: 0 ms
    Time complexity: O(logn)
    Space complexity: O(?) (only less than 18.24%)
    */
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        return search(nums, 0, nums.length - 1, target);
    }
    
    private int search(int[] nums, int left, int right, int target) {
        if(left > right) return -1;
        int mid = (right - left) / 2 + left;
        
        if(nums[mid] == target) return mid;
        
        //if no rotations exist, binary search
        if(nums[left] < nums[mid] && nums[mid] < nums[right]) {
            return binarySearch(nums, left, right, target);
        }
        else {
            //if the middle is bigger than either end, the left side is sorted. search the left side and, if not found, repeat process on the right
            if(nums[left] < nums[mid] && nums[mid] > nums[right]) {
                int leftSearch = binarySearch(nums, left, mid - 1, target);
                if(leftSearch != -1) return leftSearch;
                else return search(nums, mid + 1, right, target);
            }
            //if the middle is smaller than either end, the right side is sorted. search the right and, if not found, repeat process on the left
            else {
                int rightSearch = binarySearch(nums, mid + 1, right, target);
                if(rightSearch != -1) return rightSearch;
                else return search(nums, left, mid - 1, target);                
            }
        } 
    }
    
    private int binarySearch(int[] nums, int left, int right, int target) {
        if(left > right) return -1;
        
        int mid = (right - left) / 2 + left;
        
        if(nums[mid] == target) return mid;
        
        if(nums[mid] > target) return binarySearch(nums, left, mid - 1, target);
        else return binarySearch(nums, mid + 1, right, target);
    }
}