/*
529. Minesweeper

Let's play the minesweeper game (Wikipedia, online game)!

You are given a 2D char matrix representing the game board. 'M' represents an unrevealed mine,
'E' represents an unrevealed empty square, 'B' represents a revealed blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines,
digit ('1' to '8') represents how many mines are adjacent to this revealed square, and finally 'X' represents a revealed mine.

Now given the next click position (row and column indices) among all the unrevealed squares ('M' or 'E'),
return the board after revealing this position according to the following rules:


1.If a mine ('M') is revealed, then the game is over - change it to 'X'.
2.If an empty square ('E') with no adjacent mines is revealed, then change it to revealed blank ('B') and all of its adjacent unrevealed squares should be revealed recursively.
3.If an empty square ('E') with at least one adjacent mine is revealed, then change it to a digit ('1' to '8') representing the number of adjacent mines.
4.Return the board when no more squares will be revealed.

Example 1:

Input:

[['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'M', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E']]

Click : [3,0]

Output:

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Explanation:




Example 2:

Input:

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Click : [1,2]

Output:

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'X', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Explanation:





Note:

1.The range of the input matrix's height and width is [1,50].
2.The click position will only be an unrevealed square ('M' or 'E'), which also means the input board contains at least one clickable square.
3.The input board won't be a stage when game is over (some mines have been revealed).
4.For simplicity, not mentioned rules should be ignored in this problem. For example, you don't need to reveal all the unrevealed mines when the game is over, consider any cases that you will win the game or flag any squares.


*/
public class Minesweeper {
    private boolean
    public char[][] updateBoard(char[][] board, int[] click) {
        char[] charNum = {'1','2','3','4','5','6','7','8'};
        int rowIndex = click[0];
        int colIndex = click[1];
        if(board[rowIndex][colIndex] == 'M') {
            board[rowIndex][colIndex] = 'X';
            return board;
        }
        if(board[rowIndex][colIndex] == 'E') {
            int mines = bfs(board, click);
            if (mines == 0) {
                board[rowIndex][colIndex] = 'E';
            } else {
                board[rowIndex][colIndex] = charNum[mines];
        }

    }

    public int bfs(char[][] board, int[] element) {
        int rowIndex = element[0];
        int colIndex = element[1];
        if (board[rowIndex][colIndex] == 'M') {
            return 1;
        }
        int mines = 0;
        for (int i = rowIndex - 1; i <= rowIndex + 1; i++) {
            if (i < 0) {
                continue;
            }
            for (int j = colIndex - 1; j <= colIndex + 1; j++) {
                if (j < 0 || (i == rowIndex && j == colIndex)) {
                    continue;
                }
                mines += bfs(board, new int[]{i, j});
            }
        }
        return mines;
    }

}
