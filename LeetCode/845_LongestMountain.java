class Solution {
    /* Needs Improvement
    Runtime: 60 ms
    Time complexity: O(n^2)
    Space complexity: O(1)
    */
    public int longestMountain(int[] A) {
        if(A.length < 3) return 0;
        
        int longestMountain = 0;
        
        for(int i = 1; i < A.length - 1; i++) {
            int left = i;
            int right = i;
            
            while(left > 0 && A[left] > A[left - 1]) left--;
            while(right < A.length - 1 && A[right] > A[right + 1]) right++;
            if(left != i && right != i) {
                int currentRange = (right - left) + 1;
            
                if(currentRange > 2 && longestMountain < currentRange) longestMountain = currentRange;
            }
        }
        
        return longestMountain;
    }
}