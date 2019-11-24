class Solution {
    /*
    Runtime: 1 ms
    Time complexity: O(n^2)
    Space complexity: O(n^2) ?
    */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        //Base case at 0
        if(numRows == 0) return triangle;
        
        for(int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                if(j == 0 || j == i - 1) {
                    row.add(j, 1); //add 1 to the start and end of the row
                }
                else {
                    row.add(j, triangle.get(i - 2).get(j) + triangle.get(i - 2).get(j - 1)); //set the ith element in the row to the sum of the elements above
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}