class Solution {
    /* 
    Runtime: 18 ms 
    Time complexity: O(n^2)
    Space complexity: O(1)
    */
    public void duplicateZeros(int[] arr) {
        //Go through array and stop before the last element (no need to check if 0)
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0) {
                int temp = arr[i + 1];
                arr[i + 1] = 0;
                //Shift the array to the right
                for(int j = i + 2; j < arr.length; j++) {
                    int temp2 = arr[j];
                    arr[j] = temp;
                    temp = temp2;
                }
                i++; //skip over the new 0
            }
        }
    }
}