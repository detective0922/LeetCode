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

    public static void main(String[] args) {
        char[][] test = new char[][]{{'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}};
        int[] click = new int[]{3, 0};
        System.out.println(new Minesweeper().updateBoard(test, click));
    }

    public char[][] updateBoard(char[][] board, int[] click) {
        int rowIndex = click[0];
        int colIndex = click[1];
        if (board[rowIndex][colIndex] == 'M') {
            board[rowIndex][colIndex] = 'X';
            return board;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        dfs(board, click, visited);
        return board;
    }

    public void dfs(char[][] board, int[] element, boolean[][] visited) {
        int rowIndex = element[0];
        int colIndex = element[1];
        if (board[rowIndex][colIndex] == 'M') {
            return;
        }
        visited[rowIndex][colIndex] = true;
        int mines = 0;
        for (int i = rowIndex - 1; i <= rowIndex + 1; i++) {
            for (int j = colIndex - 1; j <= colIndex + 1; j++) {
                if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || (i == rowIndex && j == colIndex) || visited[i][j]) {
                    continue;
                }
                if (board[i][j] == 'M') {
                    mines++;
                }
            }
        }
        if (mines == 0) {
            board[rowIndex][colIndex] = 'B';
            for (int i = rowIndex - 1; i <= rowIndex + 1; i++) {
                for (int j = colIndex - 1; j <= colIndex + 1; j++) {
                    if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || (i == rowIndex && j == colIndex) || visited[i][j]) {
                        continue;
                    }
                    dfs(board, new int[]{i, j}, visited);
                }
            }
        } else {
            board[rowIndex][colIndex] = (char) (mines + '0');
        }
    }

}
