public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        // Test cases
        System.out.println(isValidMove(1, 1)); // true
        System.out.println(isValidMove(3, 0)); // false (out of bounds)

        board[0][0] = 'X';
        System.out.println(isValidMove(0, 0)); // false (already filled)
    }

    // Checks if move is valid
    static boolean isValidMove(int row, int col) {

        // Check boundaries
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}