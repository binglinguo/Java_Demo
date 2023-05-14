package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-15 21:24
 **/
//年终奖
public class Demo1 {
    public int getMost(int[][] board) {
        // write code here
        int n = board.length;
        int m = board[0].length;
        for (int i = 1; i < n; i++) {
            board[i][0] += board[i - 1][0];
        }
        for (int j = 1; j < m; j++) {
            board[0][j] += board[0][j - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                board[i][j] += Math.max(board[i][j - 1],board[i - 1][j]);
            }
        }
        return board[n - 1][m - 1];
    }
}
