class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;  // total no . row
        int cols = matrix[0].length;  // total no. of col
        // Start from top-right corner
        int row = 0;  
        int col = cols - 1;
        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] > target) {
                col--;      // Move left
            }
            else {
                row++;      // Move down
            }
        }
        return false;
    }
}