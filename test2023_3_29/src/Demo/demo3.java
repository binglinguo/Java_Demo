package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-29 21:52
 **/
//井字棋判断是否胜利
public class demo3 {
    public boolean checkWon(int[][] board) {
        // write code here
        if(board == null){
            return false;
        }
        int n = board[0].length;
        int m = board.length;
        int countn = 0;
        int countm = 0;
        for(int i = 0; i < n; i++){
            countn = 0;
            countm = 0;
            for(int j = 0; j < m; j++){
                countn += board[i][j];
                countm += board[j][i];
            }
            if(countn == 3 || countm == 3){
                return true;
            }
        }
        //判断斜对角
        countn = 0;
        countm = 0;
        for(int i = 0 ;i < n; i++){
            countn += board[i][i];
            countm += board[i][m - 1 - i];
        }
        if(countn == 3 || countm == 3){
            return true;
        }
        return false;
    }
}
