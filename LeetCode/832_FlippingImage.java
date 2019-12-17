class Solution {
    /*
    Runtime: 1 ms
    Time complexity: O(n^2)
    Space complexity: O(1)
    */
    public int[][] flipAndInvertImage(int[][] A) {
        for(int arr[] : A) {
            for(int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        
        for(int arr[] : A) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == 0) arr[i] = 1;
                else arr[i] = 0;
            }
        }
        
        return A;
    }
}