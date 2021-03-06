/*

289. Game of Life

According to the Wikipedia's article: "The Game of Life, also known simply as Life,
is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a board with m by n cells, each cell has an initial state live (1) or dead (0).
Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):


1.Any live cell with fewer than two live neighbors dies, as if caused by under-population.
2.Any live cell with two or three live neighbors lives on to the next generation.
3.Any live cell with more than three live neighbors dies, as if by over-population..
4.Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.


Write a function to compute the next state (after one update) of the board given its current state.

Follow up:

1.Could you solve it in-place? Remember that the board needs to be updated at the same time:
You cannot update some cells first and then use their updated values to update other cells.
2.In this question, we represent the board using a 2D array. In principle, the board is infinite,
which would cause problems when the active area encroaches the border of the array. How would you address these problems?


*/
public class GameofLife {
    public static void main(String[] args) {
        new GameofLife().gameOfLife(new int[][]{{1,1},{1,0}});
    }

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int liveCells = liveNeighbor(board, i, j);
                if (board[i][j] == 0 && liveCells == 3) {
                    //reborn 10
                    board[i][j] = 2;
                }
                if (board[i][j] == 1 && (liveCells == 2 || liveCells == 3)) {
                    //live 11
                    board[i][j] = 3;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] >>=1;
            }
        }
    }

    private int liveNeighbor(int[][] board, int i, int j) {
        int mSize = Math.min(i + 2, board.length);
        int nSize = Math.min(j + 2, board[0].length);
        int live = 0;
        for (int m = Math.max(i - 1, 0); m < mSize; m++) {
            for (int n = Math.max(j - 1, 0); n < nSize; n++) {
                if ((m != i || n != j) && (board[m][n] & 1) == 1) {
                    live++;
                }
            }
        }
        return live;
    }
}
