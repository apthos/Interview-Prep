class Solution {
    /*
    Runtime: 20 ms
    Time complexity: O(nlogn)
    Space complexity: O(?)
    */
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i + 1] - arr[i];
            if(difference < min) {
                min = difference;
            }
        }
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] - arr[i] == min) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]); pair.add(arr[i + 1]);
                list.add(pair);
            }
        }
        
        return list;
    }
}