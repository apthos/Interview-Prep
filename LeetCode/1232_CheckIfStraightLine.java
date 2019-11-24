class Solution {
    /*
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates[1][0] != coordinates[0][0]) {
            //for a straight line, every slope in between coordinates should be equal to the first in the coordinates array
            double slope = ((double) coordinates[1][1] - coordinates[0][1]) / ((double) coordinates[1][0] - coordinates[0][0]);

            for(int i = 1; i < coordinates.length - 1; i++) {
                //if the coordinates have the same x-coordinate, then the slope cannot be calculated, which means its not a straight line in this context
                if(coordinates[i + 1][0] == coordinates[i][0]) return false;
                
                double tempSlope = ((double) coordinates[i + 1][1] - coordinates[i][1]) / ((double) coordinates[i + 1][0] - coordinates[i][0]);
                if(tempSlope != slope) return false;
            }

            return true;            
        }
        else {
            //for a line going upwards, every x-coordinate should be equal
            for(int i = 1; i < coordinates.length - 1; i++) {
                if(coordinates[i + 1][0] == coordinates[i][0]) return false;
            }
            
            return true;
        }
    }
}