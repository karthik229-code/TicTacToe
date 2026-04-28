public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Sample move
        placeMove(0, 0, 'X');

        // Print updated cell
        System.out.println(board[0][0]);
    }

    // UC6: Place move (assumes move already validated)
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}