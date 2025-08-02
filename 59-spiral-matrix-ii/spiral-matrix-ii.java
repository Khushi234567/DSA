class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = n - 1;
        int num = 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row: left to right
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = num++;
            }

            // Right column: top to bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num++;
            }

            // Bottom row: right to left
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) break; // avoid duplicate row
                matrix[endRow][j] = num++;
            }

            // Left column: bottom to top
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) break; // avoid duplicate column
                matrix[i][startCol] = num++;
            }

            // Move to the inner layer
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return matrix;
    }
}
