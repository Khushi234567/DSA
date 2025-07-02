class Solution {
    public void solveSudoku(char[][] board) {
        boardSolver(board, 0, 0);
    }

    // Solve board using backtracking
    private boolean boardSolver(char[][] board, int row, int col) {
        // Base case
        if (row == 9) return true;
        
    //recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return boardSolver(board, nextRow, nextCol);
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (boardSolver(board, nextRow, nextCol)) return true;
                board[row][col] = '.'; // backtrack
            }
        }

        return false;
    }

    // Check if it's safe to place a digit
    private boolean isSafe(char[][] board, int row, int col, char digit) {
        //row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) return false;
        }
        //col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) return false;
        }
        //grid

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) return false;
            }
        }

        return true;
    }
}
