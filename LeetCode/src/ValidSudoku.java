import java.util.HashSet;

/*
36. Valid Sudoku

Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.




A partially filled sudoku which is valid.


Note:
 A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

*/
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {"..5.....6".toCharArray(),"....14...".toCharArray(),".........".toCharArray(),".....92..".toCharArray(),"5....2...".toCharArray(),".......3.".toCharArray(),"...54....".toCharArray(),"3.....42.".toCharArray(),"...27.6..".toCharArray()};
        new ValidSudoku().isValidSudoku(board);
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> col = new HashSet<Character>();
            HashSet<Character> subbox = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !col.add(board[i][j])) {
                    return false;
                }
                int boxRowIndex = (i / 3) * 3 + j / 3;
                int boxColIndex = (i % 3) * 3 + j % 3;
                if (board[boxRowIndex][boxColIndex] != '.' && !subbox.add(board[boxRowIndex][boxColIndex])) {
                    return false;
                }
            }
        }
        return true;
    }
}
