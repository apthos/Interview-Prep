class Solution {
    /*
    With an array
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity: O(n)
    */
    public int climbStairsArr(int n) {
        //1 step to reach the top of n = 0 and n = 1
        if(n < 2) return 1;

        //Array to hold ways to reach n step on the stair
        int[] stairCombos = new int[n + 1];

        //Base cases
        stairCombos[1] = 1;
        stairCombos[2] = 2;
        
        //The amount of ways to reach steps 3+ can be found by adding the steps for 1 step backwards and 2 steps backwards
        for(int i = 3; i <= n; i++) {
            stairCombos[i] = stairCombos[i - 1] + stairCombos[i - 2];
        }
        
        return stairCombos[n];
    }

    /*
    Without array
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public int climbStairs(int n) {
        //1 step to reach the top of n = 0 and n = 1
        if(n < 2) return 1;

        //Base cases
        int firstStep = 1;
        int secondStep = 2;

        //Climb the stairs
        for(int i = 3; i <= n; i++) {
            int temp = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = temp;
        }

        return secondStep;
    }
}