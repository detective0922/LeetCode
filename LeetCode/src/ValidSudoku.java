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
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<Character>();
        HashSet<Character> col = new HashSet<Character>();
        HashSet<Character> subbox = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' &&  !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' &&  !col.add(board[i][j])) {
                    return false;
                }
            }
        }
    }
}
