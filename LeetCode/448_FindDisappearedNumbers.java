class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= nums.length; i++) {
            list.add(i);
        }
        
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) {
                list.remove(list.indexOf(nums[i]));
            }
        }
        
        return list;
    }
}