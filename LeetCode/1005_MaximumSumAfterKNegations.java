class Solution {
    /*
    Runtime: 2 ms
    Time complexity: O(n * m) (n = A.length / m = K)
    Space complexity: O(1)
    */
    public int largestSumAfterKNegations(int[] A, int K) {
        while(K > 0) {
            int indexOfMin = minimum(A);
            if(A[indexOfMin] < 0 || K % 2 == 1) {
                A[indexOfMin] *= -1;
                K--;
            }
            else {
                K -= 2;
            }
        }
        
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
    
    public int minimum(int[] arr) {
        int indexOfMin = 0;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[indexOfMin] > arr[i]) indexOfMin = i;
        }
        
        return indexOfMin;
    }
}