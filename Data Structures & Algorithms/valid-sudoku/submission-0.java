class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int ROWS = board.length;
        int COLS = board[0].length;

        Set<String> seen = new HashSet<>();

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                char number = board[r][c];
                if (number != '.') {
                    if (!seen.add(number + " row " + r) ||
                        !seen.add(number + " col " + c) ||
                        !seen.add(number + " box " + r/3 + "-" + c/3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}